import java.util.HashMap;

public class BookMyStayApp {

    public static void main(String[] args) {
        System.out.println("Welcome to BookMyStay App v1.0\n");

        // UC2
        Room single = new Room("Single", 1, 50);
        Room doubleRoom = new Room("Double", 2, 90);
        Room suite = new Room("Suite", 3, 150);

        single.displayRoom();
        doubleRoom.displayRoom();
        suite.displayRoom();
        System.out.println();

        // UC3: Room Inventory
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 10);
        inventory.put("Double", 5);
        inventory.put("Suite", 2);

        System.out.println("Room Inventory:");
        for (String type : inventory.keySet()) {
            System.out.println(type + " Rooms Available: " + inventory.get(type));
        }
        System.out.println();
    }
}