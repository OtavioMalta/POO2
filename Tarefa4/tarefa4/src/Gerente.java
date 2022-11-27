public class Gerente implements Comissao {

    public Gerente() {
    }

    @Override
    public Double comissao(float valor) {
        return  (valor*0.03);
    }
}
