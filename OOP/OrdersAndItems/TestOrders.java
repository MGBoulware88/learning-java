// import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 2.75);
        Item item2 = new Item("latte", 2.50);
        Item item3 = new Item("drip coffee", 0.75);
        Item item4 = new Item("capuccino", 2.50);
    
        // Orders
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Jimmy");
        Order order4 = new Order("Noah");
        Order order5 = new Order("Sam");

        //CoffeKiosks
        CoffeeKiosk coffeedore64 = new CoffeeKiosk();
    
        //Test addItem method
        order1.addItem(item3);
        order1.addItem(item4);

        order2.addItem(item1);
        order2.addItem(item3);

        order3.addItem(item1);
        order3.addItem(item4);

        order4.addItem(item2);
        order4.addItem(item1);

        order5.addItem(item2);
        order5.addItem(item3);

        //Test CoffeeKiosk addMenuItem
        coffeedore64.addMenuItem(item1);
        coffeedore64.addMenuItem(item2);
        coffeedore64.addMenuItem(item3);
        coffeedore64.addMenuItem(item4);

        //Test CoffeeKiosk menu display
        coffeedore64.displayMenu();

        //Test CoffeeKiosk newOrder
        coffeedore64.newOrder();

        // //Test setStatusMessage
        // order1.setOrderStatus(true);
        // order2.setOrderStatus(true);
        // order3.setOrderStatus(false);
        // order4.setOrderStatus(false);
        // order5.setOrderStatus(false);

        // System.out.println(order1.getStatusMessage());
        // System.out.println(order2.getStatusMessage());
        // System.out.println(order3.getStatusMessage());
        // System.out.println(order4.getStatusMessage());
        // System.out.println(order5.getStatusMessage());

        // //test getOrderTotal
        // System.out.println("Your total is: $" + order1.getOrderTotal());
        // System.out.println("Your total is: $" + order2.getOrderTotal());
        // System.out.println("Your total is: $" + order3.getOrderTotal());
        // System.out.println("Your total is: $" + order4.getOrderTotal());
        // System.out.println("Your total is: $" + order5.getOrderTotal());

        // //test display method
        // order1.display();
        // order2.display();
        // order3.display();
        // order4.display();
        // order5.display();

    }
}
