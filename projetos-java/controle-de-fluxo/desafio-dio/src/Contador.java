
import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem vindo(a), esse é o contador MHC.");
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = teclado.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = teclado.nextInt();

        try { 
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{ 
    if(parametroDois <= parametroUm){
        throw new ParametrosInvalidosException();
    }

    int contagem = parametroDois - parametroUm;

    for(int x = 1; x <= contagem; x++){
        System.out.println("Imprimindo o número: " + x);
    }
        
}
}
