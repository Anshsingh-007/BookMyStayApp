import java.util.*;

class Inventory {
    Map<String, Integer> rooms = new HashMap<>();

    Inventory() {
        rooms.put("Deluxe", 1);
    }

    synchronized void book(String type) {
        if (rooms.get(type) > 0) {
            System.out.println(Thread.currentThread().getName() + " booked");
            rooms.put(type, rooms.get(type) - 1);
        } else {
            System.out.println(Thread.currentThread().getName() + " failed");
        }
    }
}

class Task extends Thread {
    Inventory inv;

    Task(Inventory inv) {
        this.inv = inv;
    }

    public void run() {
        inv.book("Deluxe");
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        new Task(inv).start();
        new Task(inv).start();
    }
}