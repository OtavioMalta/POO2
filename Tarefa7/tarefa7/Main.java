public class Main{
    public static void main(String[] args) {

        //ex3
        //Coca
        //IMaquinaBebida maquina = new MaquinaCocaColaCompany();

        //ex4
        //Ambev
        IMaquinaBebida maquina = new MaquinaAmbev();

        Quiosque quiosque = new Quiosque(maquina);
        System.out.println("Pegando Refri: "+ quiosque.pegarRefri());
        System.out.println("Pegando Suco: "+ quiosque.pegarSuco());

        //ex5
        System.out.println("Pegando Agua: "+ quiosque.pegarAgua());

        //ex6
        maquina = new MaquinaTampico();
        Quiosque quiosque2 = new Quiosque(maquina);
        System.out.println("Pegando Refri 2: "+ quiosque2.pegarRefri());
        System.out.println("Pegando Suco 2: "+ quiosque2.pegarSuco());

        //ex7
        
    }
}