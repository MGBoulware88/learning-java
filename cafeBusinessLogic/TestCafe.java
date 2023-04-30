import java.util.ArrayList;
import java.util.Random;

public class TestCafe {
    public static void main(String[] args) {
        /* ============ App Test Cases ============= */
        CafeUtil appTest = new CafeUtil();
        Random randomNumberGenerator = new Random();

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n",
        appTest.getStreakGoal(10));

        System.out.println("----- Order Total Test-----");
        double[] lineItems = { 1.5, 3.5, 4.0, 4.5 };
        System.out.printf("Order total: %s \n\n", appTest.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
        appTest.addCustomer(customers);
        System.out.println("\n");
        }

        /*
         * =================================================
         * ============ Ninja & Sensei Bonuses =============
         * =================================================
         */
        System.out.println("----- Price Chart Test -----");
        //run this 3 times for variance
        int count = 0;
        while (count < 3) {
        // get a random product
        int randomProductGenerator = randomNumberGenerator.nextInt((menu.size()));
        String randomProduct = menu.get(randomProductGenerator);
        // get a random price
        int randomPriceGenerator = randomNumberGenerator.nextInt((lineItems.length));
        double randomPrice = lineItems[randomPriceGenerator];
        //get random maxQty, but make sure it is >= 3 and !> 10
        int randomMaxQuantity = randomNumberGenerator.nextInt(11);
        if (randomMaxQuantity < 3) {
        randomMaxQuantity = 3;
        }
        appTest.printPriceChart(randomProduct, randomPrice, randomMaxQuantity);
        count++;
        }

        System.out.println("----- Overloaded Display Menu Test -----");
        ArrayList<Double> prices = new ArrayList<Double>();
        for (double val : lineItems) {
        prices.add(val);
        }
        appTest.displayMenu(menu, prices);

        System.out.println("----- Add Customers Test -----");
        ArrayList<String> moreCustomers = new ArrayList<String>();
        appTest.addCustomers(moreCustomers);

    }
}
