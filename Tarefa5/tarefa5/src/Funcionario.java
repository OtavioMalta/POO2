public abstract class Funcionario {
    public Double venda;
    public Double comissao;
    public Double meta;


    public Funcionario(Double venda) {
        this.venda = venda;
        template();
    }

    public void template(){
        if(this.venda < meta){
            this.comissao = getComissao();
        }else{
            this.comissao = getComissao()*0.8;
        }
    };

    public abstract Double getComissao();


    public Double getVenda() {
        return venda;
    }

    public void setVenda(Double venda) {
        this.venda = venda;
    }

    public Double valorComissao(){
        return comissao;
    }

    public Double getMeta() {
        return meta;
    }
}
