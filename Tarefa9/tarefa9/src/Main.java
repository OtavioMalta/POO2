public class Main{ // Contexto

    public static void main(String[] args) {
        Conta conta1 = new Conta(-200.0);

        conta1.saque(100.0);
        System.out.println("SALDO APOS SAQUE: " + conta1.getSaldo());

        conta1.deposito(1000.0);
        System.out.println("SALDO ATUAL: " + conta1.getSaldo());
        conta1.saque(200.0);
        
        System.out.println("SALDO APOS SAQUE: " + conta1.getSaldo());

        conta1.deposito(10000.0);
        System.out.println("SALDO ATUAL: " + conta1.getSaldo());
        conta1.saque(200000.0);
        
        System.out.println("SALDO APOS SAQUE: " + conta1.getSaldo());
        
    }
}