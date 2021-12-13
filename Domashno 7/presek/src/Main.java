import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<String> mnozestvo1 = new TreeSet<String> ();
        mnozestvo1.add("Bela");
        mnozestvo1.add("Crna");
        mnozestvo1.add("Crvena");

        Set<String> mnozestvo2 = new TreeSet<String> ();
        mnozestvo2.add("Bela");
        mnozestvo2.add("Zholta");
        mnozestvo2.add("Zelena");

        System.out.println("Presek od dvete mnozestva");
        mnozestvo1.retainAll(mnozestvo2);
        System.out.println(mnozestvo1);

    }
}