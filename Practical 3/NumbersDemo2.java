import javax.swing.*;
public class NumbersDemo2
{
    public static void main (String args[])
    {
        int num1, num2;
        String num1String, num2String;
        num1String= JOptionPane.showInputDialog(null,"Enter first integer: ");
        num1 = Integer.parseInt(num1String);
        num2String= JOptionPane.showInputDialog(null,"Enter second integer: ");
        num2 = Integer.parseInt(num2String);
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }
    public static void displayTwiceTheNumber(int n)
    {
        int FACTOR = 2;
        System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
    }
    public static void displayNumberPlusFive(int n)
    {
        int FACTOR = 5;
        System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
    }
    public static void displayNumberSquared(int n)
    {
        System.out.println(n + " squared is " + (n * n));
    }
}