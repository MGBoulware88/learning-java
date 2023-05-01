import java.util.ArrayList;

public class TypeCasting {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hello, world");
        myList.add(48);
        myList.add("Goodbye, World");

        for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            } 
            catch (ClassCastException e) {
                System.err.println("Caught ClassCastException: " + e.getMessage());
                System.err.println("The index where the exception occured is: " + i);
                System.err.println("The value that trigger it is: " + myList.get(i));
            }
            finally {
                System.out.println("We made it to the end, finally!");
            }
        }
    }
}