import java.text.DecimalFormat;
import java.util.Scanner;

public class LiKentTipCalculator
{
    public static void main(String[] args) {
    //Scanner and Decimal Format Code
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
    //This part of the code will welcome print out the starting questions to get the user's input to calculate their tip and change.
    //The user's inputs are scanned stored as variables for the calculations.
    System.out.println("Welcome to my tip calculator!");
    System.out.print("How many people are in your group?: ");
        int numPeople = scan.nextInt();
        scan.nextLine();
    System.out.print("What's the tip percentage? (0-100): ");
        int tipPercent = scan.nextInt();
        scan.nextLine();
    System.out.print("Enter a cost in dollars and cents (-1 to end): ");
        double userInput = scan.nextDouble();
        scan.nextLine();
        double cost = userInput;
        String formattedCost = formatter.format(cost);
    //"While" code is used here to get all the user's change/ user's input and store them into cost.
    while (userInput > 0) {
        System.out.print("Enter a cost in dollars and cents (-1 to end): ");
        userInput = scan.nextDouble();
        scan.nextLine();
        cost += userInput;
    }
    //This part is where all the calculations happen for the output.
    //The variables are also declared and initialized here
        cost++;
        double tipAmt = (tipPercent * cost)/100;
        String formattedtipAmt = formatter.format(tipAmt);
        double totalBill = (tipAmt + cost);
        String formattedtotalBill = formatter.format(totalBill);
        double beforeTip = (cost/numPeople);
        String formattedbeforeTip = formatter.format(beforeTip);
        double tipPerson = (tipAmt/numPeople);
        String formattedtipPerson = formatter.format(tipPerson);
        double perCost = (totalBill/numPeople);
        String formattedperCost = formatter.format(perCost);

    //This part of the code will print the outputs of all the math of the tip calculator
    System.out.println("Total Bill Before Tip: " + cost);
    System.out.println("tip Percentage: " + tipPercent);
    System.out.println("Total Tip: " + formattedtipAmt);
    System.out.println("Total Bill With Tip: "+ formattedtotalBill);
    System.out.println("Per Person Cost Before Tip: " + formattedbeforeTip);
    System.out.println("Tip per Person: " + formattedtipPerson);
    System.out.println("Total Cost Per Person: "+ formattedperCost);
}
}
