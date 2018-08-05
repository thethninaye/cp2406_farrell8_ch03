import java.util.Scanner;
public class MetricConversion
{
    public static void main (String args[])
    {
        int userInteger;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        userInteger = input.nextInt();
        convertToCentimeters(userInteger);
        convertToLiters(userInteger);
    }

    public static void convertToCentimeters(int inches)
    {
        double centimeters;
        final double cmInInch = 2.54;
        centimeters = inches * cmInInch;
        System.out.println(inches + " inches can be converted into " + centimeters + " centimeters");
    }
    public static void convertToLiters(int gallons)
    {
        double liters;
        final double litreInGallon = 3.7854;
        liters = gallons * litreInGallon;
        System.out.println(gallons + " gallons can be converted into " + liters + " liters");
    }
}