import java.io.*;
import java.util.*;

class Reservation implements Serializable {
    String id;

    Reservation(String id) {
        this.id = id;
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {

        // SAVE
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"));
            oos.writeObject(new Reservation("R1"));
            oos.close();
        } catch (Exception e) {
            System.out.println("Save error");
        }

        // LOAD
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"));
            Reservation r = (Reservation) ois.readObject();
            System.out.println("Loaded: " + r.id);
            ois.close();
        } catch (Exception e) {
            System.out.println("Load error");
        }
    }
}