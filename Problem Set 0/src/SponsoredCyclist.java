import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class SponsoredCyclist {
    public static void main(String[] args) {

        String firstName = getCyclistFirstName();
        String initial = getCyclistInitial();
        String lastName = getCyclistLastName();
        int distanceCycled = getDistanceCycled();

        displayCycleDetails(firstName, initial, lastName, distanceCycled);
    }

    private static String getCyclistFirstName()
    {
        String firstName = JOptionPane.showInputDialog("Enter your first name: ");

        return firstName;
    }

    private static String getCyclistInitial()
    {
        String initial = JOptionPane.showInputDialog("Enter your middle initial: ");

        return initial;
    }

    private static String getCyclistLastName()
    {
        String lastName = JOptionPane.showInputDialog("Enter your last name: ");

        return lastName;
    }

    private static int getDistanceCycled()
    {
        String distanceCycledAsString = JOptionPane.showInputDialog("Enter the distance cycled to nearest KM: ");

        int distanceCycled = Integer.parseInt(distanceCycledAsString);

        return distanceCycled;
    }

    private static void displayCycleDetails(String firstName, String initial, String lastName, int distanceCycled)
    {
        float moneyDue = calculateMoneyDue(distanceCycled);

        JOptionPane.showMessageDialog(null, "Cyclist : " + firstName + " " + initial + ". " + lastName + "\nDistance Cycled : " + distanceCycled + " KM\nMoney Due : €" + (moneyDue/100.0));
    }

    private static float calculateMoneyDue(int distanceCycled)
    {
        float moneyDue;

        if (distanceCycled <= 10)
        {
            moneyDue = distanceCycled * 7;
        }

        else
        {
            distanceCycled = distanceCycled - 10;

            moneyDue = distanceCycled * 10;

            moneyDue += 70;
        }

        return moneyDue;
    }
}
