public class Gerente extends Funcionario{

    public Gerente(Double venda) {
        super(venda);
        super.meta = 20000.0;
    }



    @Override
    public Double getComissao() {
        return venda*0.03;
    }
}
