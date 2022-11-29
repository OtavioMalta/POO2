public class MaquinaDeRefri extends MaquinaDeBebida{
   
    @Override
    public Bebida entregarBebida(){
        return new Refrigerante();
    }

    public MaquinaDeRefri(){

    }
}