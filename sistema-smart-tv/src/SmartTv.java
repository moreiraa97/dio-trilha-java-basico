
public class SmartTv {

    private boolean ligada = false; 
    private int canal = 1; 
    private int volume = 25;


    
    //métodos
    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    } 


    public void ligar(){
        this.ligada = true; 
    }

    public void desligar(){
        this.ligada = false; 
    }

    public void aumentarVolume(){
        this.volume = getVolume() + 1; 
        System.out.println("Aumentando o volume para: " + getVolume());
    }

    public void diminuirVolume(){
        this.volume = getVolume() - 1; 
        System.out.println("Diminuinto o volume para: " + getVolume());
    }

    public void mudarCanal(int canal){
        this.canal = canal; 
    }

    public void aumentarCanal(){
        this.canal = getCanal() + 1; 
    }

    public void diminuirCanal(){
        this.canal = getCanal() - 1;
    }



    @Override
    public String toString() {
        return "\nSmartTv \n[ligada: " + ligada + ", canal: " + canal + ", volume: " + volume + "]\n";
    }


}
