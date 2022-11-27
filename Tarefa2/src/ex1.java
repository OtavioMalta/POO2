import java.util.ArrayList;
import java.util.*;

public class ex1 {
    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<>(Arrays.asList("Bernardo","Carlos", "Ana"));

        /*
        listaNomes.add("Bernardo");
        listaNomes.add("Carlos");
        listaNomes.add("Ana");
         */
        Collections.sort(listaNomes);
        System.out.println(listaNomes);
        /*
        for(String s : listaNomes){
            System.out.println(s);
        }*/
    }
}
