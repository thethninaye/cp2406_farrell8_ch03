import javax.swing.*;
public class BookstoreCredit
{
        public static void main (String args[])
        {
            String name, gpaString;
            double gpa;
            name = JOptionPane.showInputDialog(null,"Please enter your name: ");
            gpaString = JOptionPane.showInputDialog(null,"Please enter your GPA: ");
            gpa = Double.parseDouble(gpaString);
            computeCredit(name,gpa);
        }
        public static void computeCredit(String name, double gpa)
        {
            double credit;
            double FACTOR = 10;
            credit = gpa * FACTOR;
            System.out.println(name + "'s GPA is " + gpa + " and therefore is eligible for discount of $" + credit + ".");
        }
}