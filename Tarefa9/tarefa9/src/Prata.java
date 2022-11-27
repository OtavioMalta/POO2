public class Prata implements Estado {
    
    @Override
    public Double saque(Double valor) {
        Double v = valor -1;
        System.out.println("Valor sacado" + v);
        return v;
    }

    @Override
    public Double deposito(Double valor) {
        System.out.println("Valor depositado: " + valor );
        return valor;
    }
}
