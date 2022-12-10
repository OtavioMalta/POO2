public class MaquinaCocaColaCompany implements IMaquinaBebida{//ConcretFactory

    @Override
    public IRefrigerante entregarRefrigerante(){
        return new CocaColaNormal();
    }

    @Override
    public ISuco entregarSuco(){
        return new DelValle();
    }

    @Override
    public IAgua entregarAgua(){
        return new Crystal();
    }

    @Override
    public IRefrigerante entregarRefrigeranteZero(){
        return new CocaColaZero();
    }
}