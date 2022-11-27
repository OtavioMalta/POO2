public class ex1 {

    public static <T> void imprimeArray(T[] array){
        for(T elemento: array){
            System.out.printf("%s ", elemento);
        }
    }

    public static void main(String[] args) {
        Integer[] arrayInt = {1,2,3};
        String[] arrrayString = {"string1", "string2", "string3"};
        Double[] arrayDouble = {1.1,2.2,3.3};

       imprimeArray(arrayInt);
       imprimeArray(arrrayString);
       imprimeArray(arrayDouble);
    }

}
