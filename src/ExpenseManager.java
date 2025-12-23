package src;

import java.util.ArrayList;

/**
 * Handles all operations related to managing expenses.
 * Uses an ArrayList to store Expense objects.
 */
public class ExpenseManager {
    private ArrayList<Expense> exps;

    public ExpenseManager() {
        exps = new ArrayList<Expense>();
    }

    public void addExpense(double amount, String category, String description) {
        Expense exp = new Expense(amount, category, description);
        exps.add(exp);
    }

    public void viewExpenses() {
        if (exps.isEmpty()) {
            System.out.println("No expenses recorded yet.\n");
            return;
        }

        System.out.println("\n--- List of Expenses ---");
        for (int i = 0; i < exps.size(); i++) {
            Expense exp = exps.get(i);
            int num = i + 1;
            System.out.println(num + ". " + exp.toString());
        }
        System.out.println();
    }

    public double calculateTotalExpense() {
        double total = 0.0;
        for (int i = 0; i < exps.size(); i++) {
            total += exps.get(i).getAmount();
        }
        return total;
    }

    public void filterByCategory(String category) {
        boolean found = false;
        System.out.println("\n--- Expenses in Category: " + category + " ---");
        for (int i = 0; i < exps.size(); i++) {
            Expense exp = exps.get(i);
            if (exp.getCategory().equalsIgnoreCase(category)) {
                System.out.println(exp.toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No expenses found in this category.");
        }
        System.out.println();
    }
}
