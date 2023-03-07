import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("meal costs calculator");
        System.out.println("Calculation summ of two meals");
        System.out.println("Provide lunch costs in eur: ");
        int lunchCosts;
        int dinnerCosts;
        int numberofPersons;
        int costsonePerson;
        int calculationPeriod;
        //TODO: explain object creation
        Scanner inputReader = new Scanner(System.in);
        lunchCosts = inputReader.nextInt();
        System.out.println("You provided costs in eur:" + lunchCosts);
        System.out.println("Provide dinner costs in eur: ");
        dinnerCosts = inputReader.nextInt();
        System.out.println("You provided cocts in eur:" + dinnerCosts);
        int sum = lunchCosts + dinnerCosts;
        System.out.println("Sum of meal costs in eur is: " + sum);
        System.out.println("Provide number of persons in meal:");
        numberofPersons = inputReader.nextInt();
        System.out.println("You provided number of persons in meals:" + numberofPersons);
        int division = ((lunchCosts + dinnerCosts) / numberofPersons);
        System.out.println("Costs for one person in eur is:" + division);
        System.out.println("Provide calculation period in days:");
        calculationPeriod = inputReader.nextInt();
        System.out.println("You provided calculation period in days: " + calculationPeriod);
        int multiplication = division * calculationPeriod;
        System.out.println("Costs for calculation period in eur (max 9 numbers):" + multiplication);














    }
}