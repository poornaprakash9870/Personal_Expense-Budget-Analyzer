# Personal Expense & Budget Analyzer

A console-based Java application for analyzing income and expense transactions using the Java Stream API. The application reads transaction data from a CSV file and provides different financial summaries and analysis options.

## Features

- Calculate total income
- Calculate total expenses
- Calculate current balance
- Find the highest expense
- Find the lowest expense
- Calculate average expense
- Analyze expenses by category
- Analyze expenses by month
- Analyze income by month
- Identify the highest-spending category
- Display the top 5 expenses
- Count the total number of transactions
- Find expenses below a specified amount

## Tech Stack

- Java
- Java Collections Framework
- Java Stream API
- File I/O
- CSV

## Project Structure

```text
Personal-Expense-Budget-Analyzer/
├── Main.java
├── Transaction.java
├── Budget_service.java
├── csvReader.java
└── expenses.csv
```
How It Works

The application reads transaction data from a CSV file and converts each record into a Transaction object.

The transactions are stored in a collection and processed using Java Stream API operations to perform different financial calculations and analysis.



CSV File → CSV Reader → Transaction Objects → Collection → Budget Service → Java Stream API → Financial Analysis → Console Output
