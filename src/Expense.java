package src;

import java.text.DecimalFormat;

public class Expense {
    private double amt;
    private String cat;
    private String desc;

    public Expense(double amount, String category, String description) {
        this.amt = amount;
        this.cat = category;
        this.desc = description;
    }

    public double getAmount() {
        return amt;
    }

    public void setAmount(double amount) {
        this.amt = amount;
    }

    public String getCategory() {
        return cat;
    }

    public void setCategory(String category) {
        this.cat = category;
    }

    public String getDescription() {
        return desc;
    }

    public void setDescription(String description) {
        this.desc = description;
    }

    public String toString() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        return "Amount: Rs. " + fmt.format(amt)
                + " | Category: " + cat
                + " | Description: " + desc;
    }
}
