public class MaquinaAmbev implements IMaquinaBebida{//ConcretFactory

    @Override
    public IRefrigerante entregarRefrigerante(){
        return new Pepsi();
    }

    @Override
    public ISuco entregarSuco(){
        return new DoBem();
    }

    @Override
    public IAgua entregarAgua() {
        return new Ama();
    }

    @Override
    public IRefrigerante entregarRefrigeranteZero() {
        return null;
    }
}