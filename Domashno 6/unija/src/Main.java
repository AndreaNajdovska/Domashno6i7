import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Kompjuter");
        l1.add("Laptop");
        l1.add("Monitor");
        List<String> l2 = new ArrayList<String>();
        l2.add("Kamera");
        l2.add("Fotoaparat");
        l2.add("Objektiv");

        l1.addAll(l2);

        System.out.println(l1);
    }
}
