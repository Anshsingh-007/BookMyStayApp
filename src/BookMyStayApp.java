// UC2: Hardcoded room types
class Room {
    String type;
    int beds;
    int price;

    Room(String type, int beds, int price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    void displayRoom() {
        System.out.println(type + " Room | Beds: " + beds + " | Price: $" + price);
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {
        // UC1
        System.out.println("Welcome to BookMyStay App v1.0\n");

        // UC2
        Room single = new Room("Single", 1, 50);
        Room doubleRoom = new Room("Double", 2, 90);
        Room suite = new Room("Suite", 3, 150);

        single.displayRoom();
        doubleRoom.displayRoom();
        suite.displayRoom();
        System.out.println();
    }
}