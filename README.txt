Expense Tracker - Console-Based Java Application

This is a simple console-based Expense Tracker application built using core Java.
The project focuses on clean code structure, object-oriented principles, and basic
data structures without using any external libraries or frameworks.

Features
- Add an expense with amount, category, and description
- View all recorded expenses
- Calculate total expenses
- Filter expenses by category
- Menu-driven console interface

Code Structure
-> Expense.java  
  Defines the Expense model with private fields and public getters/setters to ensure encapsulation.

-> ExpenseManager.java  
  Manages a dynamic list of expenses using ArrayList and provides helper methods such as:
  addExpense, viewExpenses, calculateTotalExpense, and filterByCategory.

-> Main.java  
  Acts as the entry point of the application. Displays the menu, handles user input,
  and calls the appropriate methods from ExpenseManager.

Concepts Used
- Core Java
- Object-Oriented Programming (Encapsulation)
- ArrayList
- Loops and conditional statements
- Scanner for user input

How to Run (Using VS Code)
1. Open the project folder in Visual Studio Code.
2. Open Main.java.
3. Click the Run button in the editor or use the Run menu.
4. Follow the on-screen menu instructions in the terminal.

Sample Output
--------- Expense Tracker --------
1. Add Expense  
2. View All Expenses  
3. View Total Expenses  
4. Filter Expenses by Category  
5. Exit  

Time Complexity
- Adding an expense: O(1)
- Viewing, filtering, and totaling expenses: O(n)

Future Improvements
- Save and load expenses from a file
- Generate simple summary reports (category-wise or monthly totals)
