package equipamentos.ligacao;

public class Telefone implements AparelhoTelefonico{

    public void atender() {
        System.out.println("Ligação atendida!");        
    }
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado!");        
    }
    public void ligar() {
        System.out.println("Ligação concluída!");        
    }
    
    
}
