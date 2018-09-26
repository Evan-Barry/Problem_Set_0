import javax.swing.*;

public class SimpleCalculation {
    public static void main(String[] args) {

        String studentName = getStudentName();
        String className = getClassName();
        int numOfSnacks = getNumOfSnacks();

        displayPurchase(studentName, className, numOfSnacks);
    }

    private static String getStudentName()
    {
        String studentName = JOptionPane.showInputDialog("Please enter your name:");

        return studentName;
    }

    private static String getClassName()
    {
        String className = JOptionPane.showInputDialog("Please enter your class: ");

        return className;
    }

    private static int getNumOfSnacks()
    {
        String numOfSnacksAsString = JOptionPane.showInputDialog("How many snacks would you like?");
        int numOfSnacks = Integer.parseInt(numOfSnacksAsString);

        return numOfSnacks;
    }

    private static void displayPurchase(String studentName, String className, int numOfSnacks)
    {
        JOptionPane.showMessageDialog(null, "Name : " + studentName + "\nClass : " + className + "\nNumber of Snacks : " + numOfSnacks + "\nCost : €" + (numOfSnacks * 2));
    }
}
