import java.text.DecimalFormat;
import java.util.Scanner;

public class LiKentTipCalculator
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
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

    while (userInput > 0) {
        System.out.print("Enter a cost in dollars and cents (-1 to end): ");
        userInput = scan.nextDouble();
        scan.nextLine();
        cost += userInput;
    }

    cost++;
    System.out.print("Total Bill Before Tip: " + cost);
    System.out.print("tip Percentage: " + tipPercent);
    System.out.print("Total Tip: ")
}
}
