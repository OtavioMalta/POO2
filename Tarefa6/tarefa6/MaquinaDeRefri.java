public class MaquinaDeRefri extends MaquinaDeBebida{ // Creator
   
    @Override
    public Bebida entregarBebida(){
        return new Refrigerante();
    }

    public MaquinaDeRefri(){

    }
}