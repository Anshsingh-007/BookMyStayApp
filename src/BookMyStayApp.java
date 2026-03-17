import java.util.*;

class Reservation {
    String id, name, roomType;

    Reservation(String id, String name, String roomType) {
        this.id = id;
        this.name = name;
        this.roomType = roomType;
    }

    public String toString() {
        return id + " | " + name + " | " + roomType;
    }
}

class BookingHistory {
    List<Reservation> list = new ArrayList<>();

    void add(Reservation r) {
        list.add(r);
    }

    List<Reservation> getAll() {
        return new ArrayList<>(list);
    }
}

class ReportService {
    void show(List<Reservation> list) {
        for (Reservation r : list) {
            System.out.println(r);
        }
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        BookingHistory history = new BookingHistory();

        history.add(new Reservation("R1", "Ansh", "Deluxe"));
        history.add(new Reservation("R2", "Rahul", "Standard"));

        new ReportService().show(history.getAll());
    }
}