import java.math.BigDecimal;
import java.util.*;

public class _03EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quantity = Double.parseDouble(scanner.nextLine());
        double pricePerKilo = 1.20;
        BigDecimal priceInLevs = new BigDecimal(pricePerKilo * quantity);
        BigDecimal exchangeRate = new BigDecimal("4210500000000");
        BigDecimal marksNeeded = exchangeRate.multiply(priceInLevs);
        System.out.printf("%.2f marks", marksNeeded);
    }
}
