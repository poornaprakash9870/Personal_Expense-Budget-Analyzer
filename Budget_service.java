package Streams.Expenses_calculator;

import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Budget_service {
    ArrayList<Transaction> transactions;
    Budget_service(ArrayList<Transaction> transactions){
        this.transactions = transactions;
    }

    public int totalIncome(){
        return transactions.stream()
                .filter(x -> x.getType().equals("INCOME"))
                .mapToInt(x ->x.getAmt())
                .sum();
    }
    public int totalExpense(){
        return transactions.stream()
                .filter(x -> x.getType().equals("EXPENSE"))
                .mapToInt(x ->x.getAmt())
                .sum();
    }
    public int balance(){
        return totalIncome() - totalExpense();
    }

    public Optional<Transaction> highestExpense(){
        return transactions.stream()
                .filter(x -> x.getType().equals("EXPENSE"))
                .max(Comparator.comparingInt(x -> x.getAmt()));
    }

    public Optional<Transaction> lowestExpense(){
        return transactions.stream()
                .filter(x -> x.getType().equals("EXPENSE"))
                .min(Comparator.comparingInt(x -> x.getAmt()));
    }
    public double averageExpense(){
        return transactions.stream()
                .filter(x -> x.getType().equals("EXPENSE"))
                .mapToInt(x -> x.getAmt())
                .average().orElse(0);
    }
    public Map<String, Integer> categoryWiseExpenses(){
        return transactions.stream()
                .filter(x ->x.getType().equals("EXPENSE"))
                .collect(Collectors.groupingBy(
                        x -> x.getCategory(),
                        Collectors.summingInt(x ->x.getAmt())
                ));
    }
    public Map<Month,Integer> monthlyExpenses(){
        return transactions.stream()
                .filter(x ->x.getType().equals("EXPENSE"))
                .collect(Collectors.groupingBy(
                        x -> x.getDate().getMonth(),
                        Collectors.summingInt(x ->x.getAmt())
                ));
    }
    public Map<Month,Integer> monthlyIncome(){
        return transactions.stream()
                .filter(x ->x.getType().equals("INCOME"))
                .collect(Collectors.groupingBy(
                        x -> x.getDate().getMonth(),
                        Collectors.summingInt(x ->x.getAmt())
                ));
    }
    public String highestSpendingCategory(){

        return categoryWiseExpenses()
                .entrySet()
                .stream()
                .max((a,b) -> a.getValue() - b.getValue())
                .get()
                .getKey();
    }

    public List<Transaction> top5Expenses(){
        return transactions.stream()
                .filter(x ->x.getType().equals("EXPENSE"))
                .sorted(
                        Comparator.comparingInt(Transaction::getAmt)
                                .reversed()
                )
                .limit(5)
                .toList();

    }
    public int numberOfTransactions(){
        return transactions.size();
    }

    public List<Transaction> expensesBelow1000(){
        return transactions.stream()
                .filter(x -> x.getType().equals("EXPENSE"))
                .filter(x -> x.getAmt() <1000)
                .toList();
    }
}
