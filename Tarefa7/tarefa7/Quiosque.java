public class Quiosque{//Client

    public IMaquinaBebida iMaquinaBebida;

    //ex2
    public Quiosque(IMaquinaBebida iMaquinaBebida){
        this.iMaquinaBebida = iMaquinaBebida;
    }

    public IMaquinaBebida getIMaquinaBebida(){
        return iMaquinaBebida;
    }

    public String pegarRefri(){
        return iMaquinaBebida.entregarRefrigerante() == null ? "Não há esta bebida para esta maquina" : iMaquinaBebida.entregarRefrigerante().pegar();
    }

    public String pegarSuco(){
        return iMaquinaBebida.entregarSuco() == null ? "Não há esta bebida para esta maquina" : iMaquinaBebida.entregarSuco().pegar();
    }

    public String pegarAgua(){
        return iMaquinaBebida.entregarAgua() == null ? "Não há esta bebida para esta maquina" : iMaquinaBebida.entregarAgua().pegar();
    }

    public String pegarRefriZero(){
        return iMaquinaBebida.entregarRefrigeranteZero() == null ? "Não há esta bebida para esta maquina" : iMaquinaBebida.entregarRefrigeranteZero().pegar();
    }
}
