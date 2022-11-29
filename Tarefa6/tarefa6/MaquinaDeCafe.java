public class MaquinaDeCafe extends MaquinaDeBebida {

    @Override
    public Bebida entregarBebida() {
        return new Cafe();
    }
    
}
