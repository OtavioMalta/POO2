public class Vendedor implements Comissao {

    public Vendedor() {
    }

    @Override
    public Double comissao(float valor) {
        return  (valor*0.02);
    }
}
