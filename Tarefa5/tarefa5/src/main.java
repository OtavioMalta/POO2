import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Atendente a = new Atendente(5000.0);
        Vendedor v = new Vendedor(16000.0);
        Gerente g = new Gerente(18000.0);

        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        lista.add(a);
        lista.add(v);
        lista.add(g);

        for(Funcionario f : lista){
            System.out.println("tipo: "+ f.getClass() + "; meta: " + f.getMeta() + "; venda: " + f.getVenda() + "; comissao: "+ f.getComissao());
        }
    }
}
