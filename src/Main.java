package src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager mgr = new ExpenseManager();
        boolean exit = false;

        DecimalFormat fmt = new DecimalFormat("0.00");

        while (!exit) {
            showMenu();
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter category: ");
                    String cat = sc.nextLine();

                    System.out.print("Enter description: ");
                    String desc = sc.nextLine();

                    mgr.addExpense(amt, cat, desc);
                    System.out.println("Expense added successfully!\n");
                    break;
                case 2:
                    mgr.viewExpenses();
                    break;
                case 3:
                    double total = mgr.calculateTotalExpense();
                    System.out.println("Total Expense: Rs. " + fmt.format(total) + "\n");
                    break;
                case 4:
                    System.out.print("Enter category to filter: ");
                    String filterCat = sc.nextLine();
                    mgr.filterByCategory(filterCat);
                    break;
                case 5:
                    System.out.println("Thank you for using the Expense Tracker. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.\n");
            }
        }

        sc.close();
    }

    private static void showMenu() {
        System.out.println("--------- Expense Tracker --------");
        System.out.println("1. Add Expense");
        System.out.println("2. View All Expenses");
        System.out.println("3. View Total Expenses");
        System.out.println("4. Filter Expenses by Category");
        System.out.println("5. Exit");
    }
}
