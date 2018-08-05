import java.util.Scanner;
public class PaintCalculator
{
    public static void main (String args[])
    {
        double length, width, height, price;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the room's length : ");
        length = input.nextDouble();
        System.out.print("Enter the room's width : ");
        width = input.nextDouble();
        System.out.print("Enter the room's height : ");
        height = input.nextDouble();

        price = computePrice(length, width, height);

        System.out.println("The price to paint the room is $" + price);
    }

    public static double computePrice(double length, double width, double height)
    {
        final double PRICE_OF_GALLON = 32;
        double area = length * height * 2 + width * height * 2;
        double gallons;
        double price;
        gallons = computeGallons(area);
        System.out.println(gallons + " gallons is needed to paint the room.");
        price = gallons * PRICE_OF_GALLON;
        return price;
    }
    public static double computeGallons(double area)
    {
        final int SQFT_PER_GAL = 350;
        double gallons = area / SQFT_PER_GAL;
        return gallons;
    }
}
