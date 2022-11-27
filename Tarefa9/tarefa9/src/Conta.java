public class Conta{ //Contexto
    private Estado estado;
    private Double saldo;
    
    Conta(Double saldo){
        this.saldo = saldo;
        setEstado(saldo);
    }
    
    public void saque(Double valor){
        if(valor <= saldo){
            this.saldo -= estado.saque(valor);
            setEstado(this.saldo);
        }else{
            System.out.println("SALDO INSUFICIENTE!");
        }
    }

    public void deposito(Double valor){
        this.saldo += estado.deposito(valor);
        setEstado(this.saldo);
    }

    public void setEstado(Double saldo){
        if(saldo > 0 && saldo <= 1000){
            this.estado  = new Prata();
            System.err.println("Estado Prata");
        }else if(saldo > 1000){
            this.estado  = new Ouro();
            
            System.err.println("Estado Ouro!");
        }else{
            this.estado  = new Vermelho();
            
            System.err.println("Estado Vermelho!");
        }
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
        setEstado(saldo);
    }

    public Double getSaldo(){
        return saldo;
    }

    public Estado getEstado(){
        return estado;
    }
}
