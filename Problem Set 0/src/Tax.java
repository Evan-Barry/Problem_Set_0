import javax.swing.*;

public class Tax {
    public static void main(String[] args) {

        String name = getName();
        float grossIncome = getIncome();
        int taxRate = calculateTaxRate(grossIncome);
        float tax = calculateTax(grossIncome, taxRate);
        float netIncome = calculateNetIncome(grossIncome, tax);
        displayDetails(grossIncome, taxRate, tax, netIncome);

    }

    private static String getName()
    {
        String name = JOptionPane.showInputDialog("Please enter your name:");

        return name;
    }

    private static float getIncome()
    {
        String incomeAsString = JOptionPane.showInputDialog("Please enter your income:");
        float income = Float.parseFloat(incomeAsString);

        return income;
    }

    private static int calculateTaxRate(float income)
    {
        int taxRate;

        if(income >= 0 && income <= 20000f)
        {
            taxRate = 0;
        }

        else if (income > 20000f && income <= 36000f)
        {
            taxRate = 20;
        }

        else
        {
            taxRate = 41;
        }

        return taxRate;
    }

    private static float calculateTax(float income, int taxRate)
    {
        float tax = 0f;

        if (taxRate == 0)
        {
            return tax;
        }

        else if(taxRate == 20)
        {
            tax = income * .2f;

            return tax;
        }

        else
        {
            tax = income * .41f;

            return tax;
        }
    }

    private static float calculateNetIncome(float income, float tax)
    {
        float net;

        net = income - tax;

        return net;
    }

    private static void displayDetails(float grossIncome, int taxRate, float tax, float netIncome)
    {
        JOptionPane.showMessageDialog(null, "Gross Income : " + grossIncome + "\nTax Rate : " + taxRate + "%\nTax : " + tax + "\nNet Income : " + netIncome);
    }
}
