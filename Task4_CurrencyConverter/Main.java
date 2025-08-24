import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Simple static exchange rates for demo
        double usdToInr = 83.0;
        double inrToUsd = 1 / usdToInr;
        double usdToEur = 0.92;
        double eurToUsd = 1 / usdToEur;

        System.out.println("Currency Converter");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.println("3. USD to EUR");
        System.out.println("4. EUR to USD");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        double result = 0;
        String symbol = "";

        switch (choice) {
            case 1:
                result = amount * usdToInr;
                symbol = "INR";
                break;
            case 2:
                result = amount * inrToUsd;
                symbol = "USD";
                break;
            case 3:
                result = amount * usdToEur;
                symbol = "EUR";
                break;
            case 4:
                result = amount * eurToUsd;
                symbol = "USD";
                break;
            default:
                System.out.println("Invalid option!");
                sc.close();
                return;
        }

        System.out.println("Converted Amount: " + result + " " + symbol);
        sc.close();
    }
}
