import java.util.Scanner;
public class Insurance {
    public static void main (String args[])
    {
        int currentYear, birthYear, premium;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter current year:  ");
        currentYear = input.nextInt();
        System.out.print("Enter birth year: ");
        birthYear = input.nextInt();

        premium = calcPremium (currentYear, birthYear);

        System.out.println("The person would be to claim $" + premium + ".");
    }
    private static int calcPremium (int currentYear, int birthYear)
    {
        final int TO_ADD = 15;
        final int TO_MULTIPLY = 20;
        int currentAge = currentYear - birthYear;
        int decade = currentAge / 10;
        int premium = (decade + TO_ADD) * TO_MULTIPLY;
        return premium;
    }
}
