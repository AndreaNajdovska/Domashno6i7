import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("Makedonija");
        lista.add("Portugalija");
        lista.add("Izrael");
        lista.add("Srbija");
        lista.add("Avstrija");

        System.out.println("Listata sodrzhi "+ lista.size()+" elementi.");

        if(lista.size() == 3) {
            lista.add("Ungarija");
            lista.add("Grcija");

            System.out.println(lista);
        }
        else {
            System.out.println(lista);
        }
    }
}
