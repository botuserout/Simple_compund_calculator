//import java.util.Scanner;
//public class Cicalculator_ {
//    public static void main(String[] args){
//        //printf()!= is a method used to format output
//        //%[flags][width][.percision][specifier- character]
//            //Compound Interest Calculator
//        /*  A = P[1+(r/n)]^nt*/
//        Scanner sc = new Scanner(System.in);
//
//        double principal;
//        double rate;
//        int timecompounded;
//        int years;
//        double amount;
//
//        System.out.println("Enter the prinicipal amount: ");
//        principal= sc.nextDouble() ;
//        System.out.println("Enter the interest rate (in %): ");
//        rate = sc.nextDouble()/100 ;
//        System.out.println("Enter the # of times compounds per year: ");
//        timecompounded = sc.nextInt();
//        System.out.println("Enter The # of the year:");
//        years = sc.nextInt();
//
//        amount = principal * Math.pow(1+ rate /timecompounded, timecompounded * years);
//        System.out.println("The amount after "+ years + " is Rs."+ amount);
//        sc.close();
//     }
//}
//================================================================gpt generted;
import java.util.Scanner;

public class Cicalculator_ {
    public static void main(String[] args) {
        // Compound Interest Formula: A = P * (1 + r/n) ^ (nt)

        Scanner sc = new Scanner(System.in);

        // User input variables
        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        // DSA Element: Array to store amount for each year (for snapshot)
        double[] yearlyAmount;

        // Input section
        System.out.print("Enter the principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = sc.nextDouble() / 100; // convert % to decimal

        System.out.print("Enter the number of times interest is compounded per year: ");
        timeCompounded = sc.nextInt();

        System.out.print("Enter the number of years: ");
        years = sc.nextInt();

        // Initialize array to store amount for each year
        yearlyAmount = new double[years];

        // Calculate compound interest year by year
        for (int i = 1; i <= years; i++) {
            amount = principal * Math.pow(1 + rate / timeCompounded, timeCompounded * i);
            yearlyAmount[i - 1] = amount;
            System.out.printf("Year %d: Rs. %.2f%n", i, amount);
        }

        // Final amount after all years
        System.out.printf("\nTotal amount after %d years is: Rs. %.2f\n", years, yearlyAmount[years - 1]);

        sc.close();
    }
}
