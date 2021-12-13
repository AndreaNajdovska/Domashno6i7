import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> l1 =  new ArrayList<String>();
        l1.add("Stol");
        l1.add("Masa");
        l1.add("Televizor");

        List<String> l2 = new ArrayList<String>();
        l2.add("Vrata");
        l2.add("Prozorec");
        l2.add("Ramka");

        l1.retainAll(l2);

        System.out.println(l1);
    }
}