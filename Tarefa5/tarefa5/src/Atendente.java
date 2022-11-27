public class Atendente  extends Funcionario{

        public Atendente(Double venda) {
            super(venda);

            super.meta = 16000.0;
        }


        @Override
        public Double getComissao() {
            return venda*0.01;
        }
    }
