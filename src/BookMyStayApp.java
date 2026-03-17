import java.util.*;

class Service {
    String name;
    double cost;

    Service(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String toString() {
        return name + " (₹" + cost + ")";
    }
}

class AddOnServiceManager {
    Map<String, List<Service>> map = new HashMap<>();

    void addService(String reservationId, Service s) {
        map.putIfAbsent(reservationId, new ArrayList<>());
        map.get(reservationId).add(s);
    }

    void display(String reservationId) {
        List<Service> list = map.getOrDefault(reservationId, new ArrayList<>());
        double total = 0;

        for (Service s : list) {
            System.out.println(s);
            total += s.cost;
        }

        System.out.println("Total Add-on Cost: ₹" + total);
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        AddOnServiceManager manager = new AddOnServiceManager();

        manager.addService("R101", new Service("Breakfast", 500));
        manager.addService("R101", new Service("Spa", 1500));

        manager.display("R101");
    }
}