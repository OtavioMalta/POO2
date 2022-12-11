public class MaquinaDeRefri extends MaquinaDeBebida{

    private static MaquinaDeRefri _INSTANCIA = new MaquinaDeRefri(); //early
    
    private MaquinaDeRefri(){
        
    }

    public static MaquinaDeRefri getInstancia(){
        return _INSTANCIA;
    }

    @Override
    public Bebida entregarBebida(){
        return new Refrigerante();
    }

}