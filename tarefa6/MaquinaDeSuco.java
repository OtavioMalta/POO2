public class MaquinaDeSuco extends MaquinaDeBebida{

    @Override
    public Bebida entregarBebida(){
        return new Suco();
    }

    public MaquinaDeSuco(){

    }
}
