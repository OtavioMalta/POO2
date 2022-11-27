public class Vermelho implements Estado {
    
    @Override
    public Double saque(Double valor) {
        System.out.println("Não é permitido a realização de saque para esta conta!");
        return 0.0;
    }

    @Override
    public Double deposito(Double valor) {
        System.out.println("Valor depositado: " + valor );
        return valor;
    }
}
