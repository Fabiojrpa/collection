import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {

        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giulianna");

        Iterator<String> interator = listaNome.iterator();

        while (interator.hasNext()) {
            System.out.println(interator.next());

        }
    }
}