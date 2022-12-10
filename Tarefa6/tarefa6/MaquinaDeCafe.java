public class MaquinaDeCafe extends MaquinaDeBebida {//ConcretProduct

    @Override
    public Bebida entregarBebida() {
        return new Cafe();
    }
    
}
