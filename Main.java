package Streams.Expenses_calculator;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Transaction> transactions =
                csvReader.load("src/Streams/Expenses_calculator/expenses.csv");
        Scanner sc = new Scanner(System.in);
        Budget_service service = new Budget_service(transactions);

        while(true){
            System.out.println("----------Expenses Calculator----------");
            System.out.println("Options Available ");
            System.out.println("1. Total Income");
            System.out.println("2. Total Expenses");
            System.out.println("3. Current Balance");
            System.out.println("4. Highest Expense");
            System.out.println("5. Least Expense");
            System.out.println("6. Average Expense");
            System.out.println("7. Category wise Expenses");
            System.out.println("8. Monthly Expenses");
            System.out.println("9. Monthly Income");
            System.out.println("10. Highest spending category");
            System.out.println("11. Top 5 Expenses");
            System.out.println("12. No of Transactions");
            System.out.println("13. Expenses below 1000/-");
            System.out.println("14. Exit");

            System.out.print("Enter Your choice = ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice){
                case 1 -> System.out.println(service.totalIncome());

                case 2 -> System.out.println(service.totalExpense());

                case 3 -> System.out.println(service.balance());

                case 4 -> System.out.println(service.highestExpense());

                case 5 -> System.out.println(service.lowestExpense());

                case 6 -> System.out.println(service.averageExpense());

                case 7 -> System.out.println(service.categoryWiseExpenses());

                case 8 -> System.out.println(service.monthlyExpenses());

                case 9 -> System.out.println(service.monthlyIncome());

                case 10 -> System.out.println(service.highestSpendingCategory());

                case 11 -> service.top5Expenses()
                                .forEach(System.out::println);

                case 12 -> System.out.println(service.numberOfTransactions());

                case 13 -> service.expensesBelow1000()
                                .forEach(System.out::println);

                case 14 -> {
                    System.out.println("Thank You");
                    return;
                }

                default ->  System.out.println("Invalid Choice");
            }

        }

    }
}
