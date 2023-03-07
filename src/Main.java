import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("meal costs calculator");
        System.out.println("Calculation summ of two meals");
        System.out.println("Provide lunch costs in eur: ");
        double lunchCosts;
        double dinnerCosts;
        int numberofPersons;
        int costsonePerson;
        double calculationPeriod;

        Scanner inputReader = new Scanner(System.in);
        lunchCosts = inputReader.nextDouble();
        System.out.println("You provided costs in eur:" + lunchCosts);
        System.out.println("Provide dinner costs in eur: ");
        dinnerCosts = inputReader.nextDouble();
        System.out.println("You provided cocts in eur:" + dinnerCosts);
        double sum = lunchCosts + dinnerCosts;
        System.out.println("Sum of meal costs in eur is: " + sum);
        System.out.println("Provide number of persons in meal:");
        numberofPersons = inputReader.nextInt();
        System.out.println("You provided number of persons in meals:" + numberofPersons);
        double division = ((lunchCosts + dinnerCosts) / numberofPersons);
        System.out.println("Costs for one person in eur is:" + division);
        System.out.println("Provide calculation period in days (max 9 numbers):");
        calculationPeriod = inputReader.nextDouble();
        System.out.println("You provided calculation period in days : " + calculationPeriod);
        double multiplication = division * calculationPeriod;
        System.out.println("Costs for calculation period in eur :" + multiplication);














    }
}