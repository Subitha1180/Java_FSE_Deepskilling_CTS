import java.util.*;

public class FinancialForecast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of past months of revenue: ");
        int months = scanner.nextInt();

        double[] revenue = new double[months];
        System.out.println("Enter revenue for past " + months + " months:");
        for (int i = 0; i < months; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            revenue[i] = scanner.nextDouble();
        }

        System.out.print("Enter number of months to forecast: ");
        int forecastMonths = scanner.nextInt();
        double avgGrowth = 0;
        for (int i = 1; i < months; i++) {
            avgGrowth += (revenue[i] - revenue[i - 1]);
        }
        avgGrowth /= (months - 1);

        double lastRevenue = revenue[months - 1];

        System.out.println("\n Forecasted Revenue:");
        for (int i = 1; i <= forecastMonths; i++) {
            double forecast = lastRevenue + (avgGrowth * i);
            System.out.printf("Month %d: Rs%.2f%n", months + i, forecast);
        }

        scanner.close();
    }
}
