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

        // UC3
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 10);
        inventory.put("Double", 5);
        inventory.put("Suite", 2);

        // UC4: Room Search
        System.out.println("Available Rooms for Booking:");
        Room[] rooms = {single, doubleRoom, suite};
        for (Room room : rooms) {
            if (inventory.get(room.type) > 0) {
                room.displayRoom();
                System.out.println("Available: " + inventory.get(room.type));
            }
        }
        System.out.println();
    }
}