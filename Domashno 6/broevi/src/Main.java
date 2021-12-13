import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(9);
        lista.add(642);
        lista.add(129);
        lista.add(3);
        lista.add(73);

        Collections.sort(lista);

        System.out.println(lista);
    }
}
