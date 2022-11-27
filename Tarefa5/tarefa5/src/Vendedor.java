public class Vendedor  extends Funcionario{

    public Vendedor(Double venda) {
        super(venda);
        super.meta = 15000.0;
    }
    @Override
    public Double getComissao() {
        return venda*0.02;
    }
}
