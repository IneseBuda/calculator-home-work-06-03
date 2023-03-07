import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("meal costs calculator");
        System.out.println("Calculation difference of two numbers");
        System.out.println("Provide lunch costs in eur: ");
        int lunchCosts;
        int dinnerCosts;
        //TODO: explain object creation
        Scanner inputReader = new Scanner(System.in);
        lunchCosts = inputReader.nextInt();
        System.out.println("You provided costs in eur:" + lunchCosts);
        System.out.println("Provide dinner costs in eur: ");
        dinnerCosts = inputReader.nextInt();
        System.out.println("You provided cocts in eur:" + dinnerCosts);



    }
}