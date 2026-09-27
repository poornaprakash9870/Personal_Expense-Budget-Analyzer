package Streams.Expenses_calculator;

import java.time.LocalDate;

public class Transaction {
    int id;
    LocalDate date;
    String category;
    String description;
    int amt;
    String type;

    public Transaction(int id,LocalDate date,String category,String description,
                       int amt,String type) {
        this.id = id;
        this.date = date;
        this.category = category;
        this.description = description;
        this.amt = amt;
        this.type = type;
    }


    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public int getAmt() {
        return amt;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Transaction {\n" + date + " \n " + category +
                " \n " + description + " \n " +
                amt + " \n " + type + "\n"+
                '}';
    }
}
