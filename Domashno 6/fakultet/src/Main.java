import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Fakultet> lista = new ArrayList<Fakultet>();

        Fakultet f =  new Fakultet("FIKT",6,500);
        lista.add(f);
        lista.add(new Fakultet("FINKI", 7, 700));
        lista.add(new Fakultet("TFB", 8, 390));
        lista.add(new Fakultet("PMF", 10, 460));
        lista.add(new Fakultet("FILOLOSHKI", 11, 600));

        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getIme());
            System.out.println(lista.get(i).getBrojSmerovi());
            System.out.println(lista.get(i).getVkupnoStudenti());
        }
    }
}
