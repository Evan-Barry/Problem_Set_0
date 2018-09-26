import javax.swing.*;

public class switchMenu {
    public static void main(String[] args) {

        String optionAsString;
        char option;

        optionAsString = JOptionPane.showInputDialog("Which operation do you want?\nA (Addition)\nS (Subtraction)\nM (Multiplication)\nD (Division)\nQ (Quit");
        option = optionAsString.charAt(0);

        option = Character.toUpperCase(option);

        while (option != 'Q')
        {
            menu(option);
        }

    }

    private static void menu(char option)
    {
        String num1AsString = JOptionPane.showInputDialog("Enter Number 1 : ");
        float num1 = Float.parseFloat(num1AsString);

        String num2AsString = JOptionPane.showInputDialog("Enter Number 2 : ");
        float num2 = Float.parseFloat(num2AsString);

        switch (option) {
            case 'A':   Addition(num1, num2);
                        break;

            case 'S':   Subtraction(num1, num2);
                        break;

            case 'M':   Multiplication(num1, num2);
                        break;

            case 'D':   Division(num1, num2);
                        break;

            default:    JOptionPane.showMessageDialog(null, "Invalid Operation");
        }
    }

    private static void Addition(float num1, float num2)
    {
        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1+num2));
    }

    private static void Subtraction(float num1, float num2)
    {
        JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + (num1-num2));
    }

    private static void Multiplication(float num1, float num2)
    {
        JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + (num1*num2));
    }

    private static void Division(float num1, float num2)
    {
        JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + (num1/num2));
    }
}
