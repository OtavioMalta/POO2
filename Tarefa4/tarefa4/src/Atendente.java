public class Atendente implements Comissao {
    public Atendente() {
    }

    @Override
    public Double comissao(float valor) {
        return (valor*0.01);
    }
}
