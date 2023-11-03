public class Usuario {
    public static void main(String[] args) throws Exception {
        

        SmartTv smartTv = new SmartTv(); 

        smartTv.ligar();
        smartTv.mudarCanal(20);
        smartTv.aumentarVolume();

        
        System.out.println(" " + smartTv.toString());


    }
}
