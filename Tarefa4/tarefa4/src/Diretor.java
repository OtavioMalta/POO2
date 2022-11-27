public class Diretor  implements Comissao{
    public Diretor() {
    }


    @Override
    public Double comissao(float valor) {
        return  (valor*0.04);
    }
}
