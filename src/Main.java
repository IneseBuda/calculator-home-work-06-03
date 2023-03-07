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
        //TODO: explain object creation
        Scanner inputReader = new Scanner(System.in);
        lunchCosts = inputReader.nextInt();
        System.out.println("You provided costs in eur:" + lunchCosts);
        System.out.println("Provide dinner costs in eur: ");
        dinnerCosts = inputReader.nextInt();
        System.out.println("You provided cocts in eur:" + dinnerCosts);
        int sum = lunchCosts + dinnerCosts;
        System.out.println("Sum of meal costs is: " + sum);
        System.out.println("Provide number of persons in meal:");
        numberofPersons = inputReader.nextInt();
        System.out.println("You provided number of persons in meals:" + numberofPersons);
        int division = ((lunchCosts + dinnerCosts) / numberofPersons);
        System.out.println("Costs for one person is:" + division);






    }
}