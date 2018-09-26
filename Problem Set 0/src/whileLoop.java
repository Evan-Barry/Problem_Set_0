import javax.swing.*;

public class whileLoop {
    public static void main(String[] args) {

        int loops = 0;
        String numAsString = "";
        int num = 0;
        int total = 0;


        while(!numAsString.equals("q") || !numAsString.equals("Q"))
        {
            numAsString = JOptionPane.showInputDialog("Enter a number : ");

            if(numAsString.equals("q") || numAsString.equals("Q"))
            {
                break;
            }

            else
            {
                num = Integer.parseInt(numAsString);

                total += num;

                loops++;
            }
        }

        JOptionPane.showMessageDialog(null, "Total = " + total + "\nLoops = " + loops);

    }
}
