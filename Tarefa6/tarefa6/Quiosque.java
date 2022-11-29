public class Quiosque{

    public static void main(String[] args) {
        MaquinaDeBebida mRefri = new MaquinaDeRefri();
        MaquinaDeBebida mSuco = new MaquinaDeSuco();
        MaquinaDeCafe mCafe = new MaquinaDeCafe();

        Bebida bebida = mSuco.entregarBebida();
        System.out.println(bebida.tipoBebida());

        bebida = mRefri.entregarBebida();
        System.out.println(bebida.tipoBebida());
        
        bebida = mCafe.entregarBebida();
        System.out.println(bebida.tipoBebida());
    }
}