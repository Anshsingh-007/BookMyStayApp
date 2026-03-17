import java.util.*;

class InvalidBookingException extends Exception {
    InvalidBookingException(String msg) {
        super(msg);
    }
}

class Inventory {
    Map<String, Integer> rooms = new HashMap<>();

    Inventory() {
        rooms.put("Deluxe", 1);
    }

    void book(String type) throws InvalidBookingException {
        if (!rooms.containsKey(type))
            throw new InvalidBookingException("Invalid room type");

        if (rooms.get(type) <= 0)
            throw new InvalidBookingException("No rooms available");

        rooms.put(type, rooms.get(type) - 1);
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        try {
            inv.book("Luxury"); // invalid
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}