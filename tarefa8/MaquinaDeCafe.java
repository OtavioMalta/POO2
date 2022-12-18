public class MaquinaDeCafe extends MaquinaDeBebida {

    private static MaquinaDeCafe _INSTANCIA = null;

    private MaquinaDeCafe(){
        
    }

    public static synchronized MaquinaDeCafe getInstancia(){
        if(_INSTANCIA == null){
            _INSTANCIA = new MaquinaDeCafe();
        }
        return _INSTANCIA;
    }

    @Override
    public Bebida entregarBebida() {
        return new Cafe();
    }
    
}
