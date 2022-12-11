import early.Quiosque;

public class Main{
    public static void main(String[] args) {
        //ex3
        //Coca
        //IMaquinaBebida maquina = new MaquinaCocaColaCompany();

        //ex4
        //Ambev
        IMaquinaBebida maquina = new MaquinaAmbev();

        Quiosque quiosque = new Quiosque(maquina);
        System.out.println("Pegando Refri Ambev: "+ quiosque.pegarRefri());
        System.out.println("Pegando Suco Ambev: "+ quiosque.pegarSuco());

        //ex5
        System.out.println("Pegando Agua Ambev: "+ quiosque.pegarAgua());

        //ex6
        maquina = new MaquinaTampico();
        Quiosque quiosque2 = new Quiosque(maquina);
        System.out.println("\nPegando Refri Tampico: "+ quiosque2.pegarRefri());
        System.out.println("Pegando Suco Tampico: "+ quiosque2.pegarSuco());

        //ex7
        maquina = new MaquinaCocaColaCompany();
        Quiosque quiosque3 = new Quiosque(maquina);
        System.out.println("\nPegando Refri CocaColaCompany: "+ quiosque3.pegarRefri());
        System.out.println("Pegando Refri Zero CocaColaCompany: "+ quiosque3.pegarRefriZero());
    }
}