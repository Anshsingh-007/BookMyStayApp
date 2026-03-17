import java.util.*;

class Reservation {
    String id, roomType, roomId;
    boolean cancelled = false;

    Reservation(String id, String roomType, String roomId) {
        this.id = id;
        this.roomType = roomType;
        this.roomId = roomId;
    }
}

class Inventory {
    Map<String, Integer> rooms = new HashMap<>();

    Inventory() {
        rooms.put("Deluxe", 1);
    }

    void release(String type) {
        rooms.put(type, rooms.getOrDefault(type, 0) + 1);
    }
}

class CancellationService {
    Stack<String> stack = new Stack<>();
    Map<String, Reservation> map;

    CancellationService(Map<String, Reservation> map) {
        this.map = map;
    }

    void cancel(String id, Inventory inv) {
        Reservation r = map.get(id);

        if (r == null || r.cancelled) {
            System.out.println("Invalid cancellation");
            return;
        }

        stack.push(r.roomId);
        inv.release(r.roomType);
        r.cancelled = true;

        System.out.println("Cancelled: " + id);
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        Map<String, Reservation> map = new HashMap<>();

        map.put("R1", new Reservation("R1", "Deluxe", "D1"));

        new CancellationService(map).cancel("R1", inv);
    }
}