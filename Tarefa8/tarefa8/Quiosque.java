public class Quiosque{

    public static void main(String[] args) {
        MaquinaDeBebida mRefri = MaquinaDeRefri.getInstancia(); //early
        MaquinaDeBebida mSuco = MaquinaDeSuco.getInstancia(); //early
        MaquinaDeCafe mCafe = MaquinaDeCafe.getInstancia(); //lazy

        Bebida bebida = mSuco.entregarBebida();
        System.out.println(bebida.tipoBebida());

        bebida = mRefri.entregarBebida();
        System.out.println(bebida.tipoBebida());
        
        bebida = mCafe.entregarBebida();
        System.out.println(bebida.tipoBebida());
    }
}