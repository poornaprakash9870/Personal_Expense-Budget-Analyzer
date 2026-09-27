# Personal Expense & Budget Analyzer

A console-based Java application for analyzing income and expense transactions using the Java Stream API. The application reads transaction data from a CSV file and provides different financial summaries and analysis options.

## Features

* Calculate total income
* Calculate total expenses
* Calculate current balance
* Find the highest expense
* Find the lowest expense
* Calculate average expense
* Analyze expenses by category
* Analyze expenses by month
* Analyze income by month
* Identify the highest-spending category
* Display the top 5 expenses
* Count total transactions
* Find expenses below a specified amount

## Tech Stack

* Java
* Java Collections Framework
* Java Stream API
* File I/O
* CSV

## Project Structure

* `Main.java` – Handles the main application flow and user interaction
* `Transaction.java` – Represents individual income and expense transactions
* `Budget_service.java` – Performs financial calculations and analysis
* `csvReader.java` – Reads transaction data from the CSV file
* `expenses.csv` – Contains transaction data

## Application Flow

**CSV File → CSV Reader → Transaction Objects → Collection → Budget Service → Java Stream API → Financial Analysis → Console Output**

## How It Works

The application reads transaction records from the CSV file and converts each record into a `Transaction` object.

The transaction objects are stored in a collection and processed using Java Stream API operations to perform different financial calculations and analysis.

## Financial Analysis

The application can perform the following analysis:

### Income & Expense Analysis

* Total income
* Total expenses
* Current balance
* Number of transactions

### Expense Analysis

* Highest expense
* Lowest expense
* Average expense
* Top 5 expenses
* Expenses below a specified amount

### Category Analysis

* Category-wise expenses
* Highest-spending category

### Monthly Analysis

* Monthly expenses
* Monthly income

## Java Stream API Concepts Used

The project demonstrates several important Java Stream API operations, including:

* `stream()`
* `filter()`
* `map()`
* `mapToInt()`
* `sum()`
* `average()`
* `min()`
* `max()`
* `sorted()`
* `collect()`
* `groupingBy()`
* `summingInt()`

## Key Concepts

### Java Collections

Collections are used to store and manage transaction objects before performing analysis.

### File I/O

The application reads transaction information from the CSV file.

### Java Stream API

The Stream API is used to process and analyze transaction data efficiently without manually writing multiple loops.

### Object-Oriented Programming

The application separates transaction data and financial analysis into different classes.

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA or another Java IDE.
3. Make sure Java is installed and configured.
4. Keep `expenses.csv` in the correct project location.
5. Run `Main.java`.
6. Select the required analysis option from the console.

## Learning Outcomes

This project helps in understanding:

* Java Stream API
* Java Collections
* File handling
* CSV data processing
* Lambda expressions
* Filtering and sorting data
* Grouping and aggregation
* Object-oriented programming
* Basic financial data analysis

## Project Type

**Console-Based Java Application**
