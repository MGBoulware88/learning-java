import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem(Item item) {
        // instantiate an Item with given name and price
        Item newItem = new Item(item.getName(), item.getPrice());
        // set the idx
        int newItemIndex = this.menu.size();
        newItem.setIndex(newItemIndex);
        // add to this's menu member var
        this.menu.add(newItem);
    }

    public void displayMenu() {
        // display as 'idx name -- $price'
        for (Item item : this.menu) {
            System.out.println("#" + item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }

    public void newOrder() {
        // Add the customer's name to the order
        System.out.println("Please enter a customer name for new order:");
        String customerName = System.console().readLine();
        Order newOrder = new Order(customerName);
        String itemNumber = "";
        // while loop that goes if itemNumber isn't 'q'
        while (!itemNumber.equals("q")) {
            // show menu to add items
            this.displayMenu();
            // Wait for user input
            System.out.println("Please enter a menu item number or q to quit:");
            itemNumber = System.console().readLine();
            //check if they entered q before trying to add item
            if (itemNumber.equals("q")) {
                continue;
            } else {
                // use try/catch to account for user input outside bounds
                try {
                    int potentialItem = Integer.parseInt(itemNumber);
                    Item newItem = this.menu.get(potentialItem);
                    newOrder.addItem(newItem);
                    this.orders.add(newOrder);
                } catch (IndexOutOfBoundsException | NumberFormatException e) {
                    System.err.println("That item doesn't exist.");
                    this.displayMenu();
                    System.out.println("Please enter a menu item number or q to quit:");
                }
            }
        }
        //after the loop ends, print the order
        newOrder.display();
    }
}
