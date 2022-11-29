public class MaquinaAmbev implements IMaquinaBebida{

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
}