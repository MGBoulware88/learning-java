public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables
        // double mochaPrice = 5.5;
        int dripCoffee = 1;
        int latte = 2;
        int cappuccino = 9;
    
        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        // String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        // boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
        // APP INTERACTION SIMULATION

        // Cindhuri ordered a coffee. Print to the console the correct status message, based on her order status.
        String statusMessage = isReadyOrder1 ? (customer1 + readyMessage) : (customer1 + pendingMessage);
        System.out.println(statusMessage);
        // Noah ordered a cappuccino. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total.
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }
        // Sam just ordered 2 lattes, print the message to display their total. Next, use an if statement to print the appropriate order status message. 
        System.out.println(displayTotalMessage + latte * 2);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        // Change the isReady flag value from true to false or vice versa in order to test your control logic.
        isReadyOrder2 = false;
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        // Jimmy just realized he was charged for a coffee but had ordered a latte. Print the total message with the new calculated total (what he owes) to make up the difference.
        System.out.println(displayTotalMessage + (latte - dripCoffee));
    }
}
