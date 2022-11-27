import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Funcionario atendente = new Funcionario("Atendente", new Gerente(), 500);
        Funcionario gerente = new Funcionario("Gerente", new Atendente(), 500);
        Funcionario vendedor = new Funcionario("vendedor", new Vendedor(), 500);

        Funcionario gerente2 = new Funcionario("Gerente2", new Gerente(), 500);
        Funcionario diretor = new Funcionario("Diretor", new Diretor(), 500);

        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        lista.add(atendente);
        lista.add(vendedor);
        lista.add(gerente);
        lista.add(gerente2);
        lista.add(diretor);

        for(Funcionario f : lista){
            System.out.println(f.getVenda() + " " + f.getComissao());
        }

    }
}
