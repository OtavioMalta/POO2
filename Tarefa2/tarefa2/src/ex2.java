import java.util.*;

public class ex2 {
    public static <T> void main(String[] args) {
        ArrayList<T> lista1 = new ArrayList<T>((Collection<? extends T>) Arrays.asList("quatro","dois","cinco"));
        ArrayList<T> lista2 = new ArrayList<T>((Collection<? extends T>) Arrays.asList("um", "dois", "tres"));

        //imprimirListas(lista1, lista2);
        imprimirListas2(lista1, lista2);
    }

    private static <T> void imprimirListas2(ArrayList<T> lista1, ArrayList<T> lista2) {
        HashSet<Object> hash = new HashSet<>();
        for(Object o : lista1){
            hash.add(o);
        }
        for(Object o : lista2){
            if(!hash.add(o)){
                System.out.println(o);
            }
        }
        /*Iterator it1 = lista1.iterator();
        while(it1.hasNext()){
            Object o = it1.next();
            hash.add(o);
        }
        Iterator it2 = lista1.iterator();
        while(it2.hasNext()){
            Object o = it2.next();
            if(!hash.add(o)){
                System.out.println(o);
            }
        }*/

    }

    public static <T>void imprimirListas(ArrayList<T> l1, ArrayList<T> l2) {
        Iterator it = l1.iterator();

        while(it.hasNext()){
            Object e = it.next();
            if(l2.contains(e)){
                System.out.println(e);
            }
        }
    }
}
