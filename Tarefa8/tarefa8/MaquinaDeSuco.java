public class MaquinaDeSuco extends MaquinaDeBebida{ 

    private static MaquinaDeSuco _INSTANCIA = new MaquinaDeSuco(); // early
    
    private MaquinaDeSuco(){
        
    }

    public static MaquinaDeSuco getInstancia(){
        return _INSTANCIA;
    }

    @Override
    public Bebida entregarBebida(){
        return new Suco();
    }
}
