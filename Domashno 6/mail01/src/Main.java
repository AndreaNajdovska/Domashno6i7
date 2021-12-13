import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();

        for(int i=0;i<20;i++){
            if(i<9)
                lista.add("mail0"+(i+1)+"@yahoo.com");
            else
                lista.add("mail"+(i+1)+"@yahoo.com");

            System.out.println(lista.get(i));

        }
    }
}
