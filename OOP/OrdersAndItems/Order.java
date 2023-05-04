import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    // constructors
    public Order() {
        this.name = "guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // GET & SET methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setOrderStatus(boolean status) {
        this.ready = status;
    }

    public boolean isOrderReady() {
        return this.ready;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    // methods
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        return this.ready ? "Your order is ready!" : "Thank you for waiting. Your order will be ready soon.";
    }

    public double getOrderTotal() {
        // check the Items list and add all prices together
        double sum = 0;
        for (Item item : this.items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void display() {
        //print customer name first
        System.out.println("Customer Name: " + this.name);
        //then loop through the items in the order to print out their name and price
        for (Item item : this.items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }


}