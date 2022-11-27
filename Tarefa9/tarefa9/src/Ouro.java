public class Ouro implements Estado{

    @Override
    public Double saque(Double valor) {
        System.out.println("Valor sacado" + valor);
        return valor;
    }

    @Override
    public Double deposito(Double valor) {
        Double val =  valor*0.1;
        System.out.println("Valor depositado: " + v );
        return v;
    }
}