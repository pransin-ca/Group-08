package quarter2.practicalexamsubpackage;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
public class FastFoodTest {
    @Test
    public void testFastFoodFlow() {
        StringBuilder automatedInput = new StringBuilder();
        System.out.println("--- CHINESE FOOD MENU ---");
// Step 1: Order Burger as Combo (Nested option 1)
        automatedInput.append("1\n"); // Beijing Beef

        System.out.println("--- Beijing beef total 105 p ---");

        automatedInput.append("1\n"); // Beijing Beef rice combo

        System.out.println("--- Beijing beef rice combo total 114 p ---");

// Step 2: Order Burger as Solo (Nested option 2)
        automatedInput.append("1\n"); // Chicken popcorn

        System.out.println("--- Chicken popcorn total 100 p ---");

        automatedInput.append("2\n"); // Spicy noodles

        System.out.println("--- Spicy noodles total 120 p ---");
// Step 3: Order Fries option
        automatedInput.append("2\n"); // Jasmine Tea

        System.out.println("--- Jasmine tea total 50 p ---");
// Step 4: Exit system

        automatedInput.append("3\n"); // Choose Exit

        System.out.println("--- ORDER COMPLETE ---\n");

        System.out.println("--- THANK YOU FOR ORDERING! ---\n");

        ByteArrayInputStream inputStream = new ByteArrayInputStream(automatedInput.toString().getBytes());
        Scanner scanner = new Scanner(inputStream);
        FastFoodMenu fastFoodSystem = new FastFoodMenu();
        fastFoodSystem.start(scanner);
    }
}