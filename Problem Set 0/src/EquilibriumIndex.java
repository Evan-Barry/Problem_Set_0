import javax.swing.*;

public class EquilibriumIndex {
    public static void main(String[] args) {

        int length;
        String index;

        length = Integer.parseInt(JOptionPane.showInputDialog("How long is the sequence"));

        int sequence[] = new int[length];

        for(int i = 0; i  < sequence.length; i++)
        {
            sequence[i] = Integer.parseInt(JOptionPane.showInputDialog("Please enter integer number "+ (i+1)));
        }

        index = Equilibrium(sequence, length);

        if(index == "")
        {
            JOptionPane.showMessageDialog(null, "No Equilibrium");
        }

        else
        {
            JOptionPane.showMessageDialog(null, index);
        }

    }

    public static String Equilibrium(int[] array, int n)
    {
        int leftSum, rightSum, i, j;
        String index = "";

        for(i = 0; i < n; i++)
        {
            leftSum = 0;
            for(j = 0; j < i; j++)
            {
                leftSum += array[j];
            }

            rightSum = 0;
            for(j = i+1; j < n; j++)
            {
                rightSum += array[j];
            }

            if(leftSum == rightSum)
            {
                index += i + " ";
            }
        }

        return index;
    }
}
