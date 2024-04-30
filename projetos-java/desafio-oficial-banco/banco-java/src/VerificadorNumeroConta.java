import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        try {
            System.out.println("Insira o número do seu cartão: ");
            String numeroConta = teclado.nextLine();
            verficarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
            
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos. ");
        } finally {
            teclado.close();
        }
        
    }

    private static void verficarNumeroConta(String numeroConta) throws IllegalArgumentException{
        if(numeroConta.length() != 8 )
        throw new IllegalArgumentException();

    }
    
}
