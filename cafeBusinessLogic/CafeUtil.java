import java.util.ArrayList;

public class CafeUtil {
    // instantiating the NumberFormatter instance to be used to modify the output of
    // some CafeUtil methods
    NumberFormatter beatuifyMyNumbers = new NumberFormatter();

    /*
     * Cafe Java wants to implement a reward system for customers who always buy
     * more drinks than they did the week before. To calculate how many drinks they
     * need after 10 weeks, write a method that sums together every consecutive
     * integer from 1 to 10 and returns the sum. In other words, add 1 + 2 + 3. and
     * so, on up to 10 and return the result.
     * 
     * Test your code before moving on! Don't forget to make an instance of your
     * CafeUtil class to use in the test file. The number printed should be 55.
     * 
     * Ninja Bonus: Add a parameter, numWeeks so that an admin can change the number
     * from 10 to whatever they want.
     */
    public int getStreakGoal(int numWeeks) {
        // loop numWeeks times adding numbers together from 1 to numWeeks
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    /*
     * Given an array of item prices from an order, sum all of the prices in the
     * array and return the total.
     */
    public double getOrderTotal(double[] itemPrices) {
        // loop through and sum each value
        double sum = 0;
        for (double price : itemPrices) {
            sum += price;
        }
        return sum;
    }

    /*
     * Given an ArrayList of menu items (strings), print out each index and menu
     * item.
     */
    public void displayMenu(ArrayList<String> menuItems) {
        // loop through and print idx + println item at menuItems.get(i)
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.print(i + " ");
            System.out.println(menuItems.get(i));
        }
    }

    /*
     * Inside this method:
     * 
     * Print this string to the console: "Please enter your name:"
     * Then add this line of code to get user input from the terminal and store it
     * in the variable userName:
     * String userName = System.console().readLine();
     * Next print the userName to the console, saying "Hello, [username here]!"
     * Next print "There are ___ people in front of you" using the number for how
     * many people are ahead of them (how many items already in the array)
     * Then, add the customer's name to the given customers list. And print the
     * list.
     * No need to return anything.
     */
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }

    /*
     * =================================================
     * ============ Ninja & Sensei Bonuses =============
     * =================================================
     */
    /*
     * Given a product, price and a maxQuantity, create a method that prints the
     * cost for buying 1, then the price for buying 2, then for 3.. and so on, up to
     * the max. For example, if the product is "Columbian Coffee Grounds" with a
     * price of 15.0 and maxQuantity of 3, you should print:
     * Columbian Coffee Grounds
     * 1 - $15.00
     * 2 - $30.00
     * 3 - $45.00
     * 
     */
    public void printPriceChart(String product, double price, int maxQuantity) {
        // loop maxQty times, printing 'product' then 'qty - formatted price' on a new
        // line
        int quantity = 1;
        double bulkDiscount = 0;
        // print product name only once
        System.out.println(product);
        while (quantity <= maxQuantity) {
            // calc the price before formatting
            double currentPrice = price * quantity;
            currentPrice -= bulkDiscount;
            // static methods are just called on the class itself, no need to instantiate it
            String prettyPrice = NumberFormatter.myCustomFormat("$###,###.##", currentPrice);
            System.out.println(quantity + " " + "-" + " " + prettyPrice);
            quantity++;
            // discount 50 cents for each qty++
            bulkDiscount += 0.5;
        }
    }

    /*
     * Let's overload the display menu! Given 2 arrays, an ArrayList of menu items
     * (strings), and an ArrayList of prices (doubles) print a menu!
     * 
     * However, first check: if the arrays are not the same size, immediately return
     * false.
     * 
     * To print the menu, iterate from 0 to the last index. Each time through, print
     * on the same line:
     * 
     * a.) The index, b.) The menu item at that index, and c.) The price at that
     * index.
     * Finally, return true.
     */
    boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            String prettyPrice = NumberFormatter.myCustomFormat("$###,###.##", prices.get(i));
            System.out.println(i + " " + menuItems.get(i) + " -- " + prettyPrice);
        }
        return true;
    }

    //Make a method addCustomers where a barista can enter multiple customers.
    void addCustomers(ArrayList<String> customers) {
        //create the empty string for our while condition
        String newCustomer = "";
        //I have to use !(.equals()) because !='q' will never be true
        while (!(newCustomer.equals("q"))) {
            System.out.println("Please add new customers one at a time and press Enter.\nType 'q' and hit Enter or ctrl+c to quit.\nType 'show customers' and hit enter to see the current list of customers.");
            newCustomer = System.console().readLine();
            if (newCustomer.equals("show customers")) {
                System.out.println(customers);
            }
            else if (!(newCustomer.equals("q"))) {
                System.out.println("Adding new customer: " + newCustomer);
                customers.add(newCustomer);
            }
        }
    }
}