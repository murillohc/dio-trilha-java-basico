package celular;

import equipamentos.ligacao.AparelhoTelefonico;
import equipamentos.ligacao.Telefone;
import equipamentos.musica.Itunes;
import equipamentos.musica.ReprodutorMusical;
import equipamentos.navegador.NavegadorNet;
import equipamentos.navegador.Safari;

public class Iphone {
    public static void main(String[] args) {
        Itunes itunes = new Itunes();
        Telefone fone = new Telefone();
        Safari safari = new Safari();

        AparelhoTelefonico telefone = fone;
        ReprodutorMusical musica = itunes;
        NavegadorNet navegador = safari;

        telefone.atender();
        telefone.ligar();
        telefone.iniciarCorreioVoz();
        
        musica.tocar();
        musica.pausar();
        musica.selecionarMusica();

        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        navegador.exibirPagina();
    }
    
}
