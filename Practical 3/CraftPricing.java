import java.util.Scanner;
public class CraftPricing {
    public static void main (String args[])
    {
        String productName;
        double costMaterial, hoursWork, price;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter product name:  ");
        productName = input.nextLine();
        System.out.print("Enter cost of materials: ");
        costMaterial = input.nextDouble();
        System.out.print("Enter hours of work: ");
        hoursWork = input.nextDouble();

        price = calcPrice (costMaterial, hoursWork);

        System.out.println("The product name as described as >> " + productName + " << costs " + price + ".");
    }
    public static double calcPrice (double costMaterial, double hoursWork)
    {
        double price;
        final double TO_MULTIPLY = 12.0;
        final double SHIP_HANDLE = 7.0;
        price = costMaterial + hoursWork * TO_MULTIPLY + SHIP_HANDLE;
        return price;
    }
}
