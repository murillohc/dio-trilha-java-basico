import java.util.Scanner;

public class VerificadorElegibilidadeConta {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        int idade= teclado.nextInt();

        if( idade >= 18 ){
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        }else{
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }

        teclado.close();
        
    }
    
}
