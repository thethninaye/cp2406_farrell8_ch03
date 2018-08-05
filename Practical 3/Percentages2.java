import javax.swing.*;
public class Percentages2
{
    public static void main (String args[])
    {
        double num1, num2;
        String num1String, num2String;
        num1String= JOptionPane.showInputDialog(null,"Enter first integer: ");
        num1 = Double.parseDouble(num1String);
        num2String= JOptionPane.showInputDialog(null,"Enter second integer: ");
        num2 = Double.parseDouble(num2String);
        computePercent(num1, num2);
        computePercent(num2, num1);
    }
    public static void computePercent(double n1, double n2)
    {
        System.out.println(n1 + " is " + (n1 / n2) * 100 + " percent of " + n2 + ".");
    }
}
