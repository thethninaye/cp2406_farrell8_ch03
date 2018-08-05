public class Percentages
{
    public static void main (String args[])
    {
        double num1 = 10.0, num2 = 15.0;
        computePercent(num1, num2);
        computePercent(num2, num1);
    }
    public static void computePercent(double n1, double n2)
    {
        System.out.println(n1 + " is " + (n1 / n2) * 100 + " percent of " + n2 + ".");
    }
}
