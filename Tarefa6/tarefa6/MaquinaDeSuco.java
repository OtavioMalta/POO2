public class MaquinaDeSuco extends MaquinaDeBebida{ //ConcretProduct

    @Override
    public Bebida entregarBebida(){
        return new Suco();
    }

    public MaquinaDeSuco(){

    }
}
