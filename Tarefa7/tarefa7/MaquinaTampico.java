public class MaquinaTampico implements IMaquinaBebida{//ConcretFactory

    @Override
    public IRefrigerante entregarRefrigerante() {
        return null;
    }

    @Override
    public ISuco entregarSuco() {
        return new Tampico();
    }

    @Override
    public IAgua entregarAgua() {
        return null;
    }

    @Override
    public IRefrigerante entregarRefrigeranteZero() {
        return null;
    }
    
}
