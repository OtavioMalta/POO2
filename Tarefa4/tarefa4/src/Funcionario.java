public class Funcionario {
    String cargo;
    float comissao;
    float venda;
    Comissao tipoComissao;

    public Funcionario(String cargo, Comissao tipoComissao, float venda) {
        this.cargo = cargo;
        this.tipoComissao = tipoComissao;
        this.venda = venda;
    }

    public Double getComissao() {
        return tipoComissao.comissao(this.venda);
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public Comissao getTipoComissao(){
        return tipoComissao;
    }

    public void getTipoComissao(Comissao tipoComissao){
        this.tipoComissao = tipoComissao;
    }

    public float getVenda() {
        return venda;
    }

    public void setVenda(float venda) {
        this.venda = venda;
    }
}
