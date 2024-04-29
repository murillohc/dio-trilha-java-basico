

public class SmartTv {
    int canal = 1;
    int volume = 25;
    boolean ligado = false;


    public void ligar(){
        ligado = true;
    }
 
    public void  desligar(){
        ligado = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);

    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);

    }

    public void mudarProximo (){
        canal++;

    }

    public void  mudarAnterior (){
        canal--;

    }
    public void selecionarCanal (int novoCanal ){
        canal=novoCanal;


    }

}
