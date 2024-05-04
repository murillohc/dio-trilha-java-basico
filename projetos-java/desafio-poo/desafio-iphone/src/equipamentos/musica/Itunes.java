package equipamentos.musica;

public class Itunes implements ReprodutorMusical {

    public void pausar() {
        System.out.println("Música pausada!");
    }
    public void selecionarMusica() {   
        System.out.println("Música selecionada!");
    }
    public void tocar() {
        System.out.println("Tocando música!");

    }
    
    
}
