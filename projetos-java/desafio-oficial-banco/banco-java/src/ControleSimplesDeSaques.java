import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira seu limite diário de saque: ");
        double limiteDiario = teclado.nextDouble();
       

         for (int i = 0; i < 100; i++) {
            System.out.println("Insira o valor do saque desejado: ");
            double saqueDiario = teclado.nextDouble();
            if (saqueDiario == 0){
                System.out.println("Transações encerradas.");
                break;
                
            }
            if(saqueDiario > limiteDiario){
                System.out.println("Limite diário de saque atingido.");
                System.exit(0);
            }else{
                limiteDiario = limiteDiario - saqueDiario;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }


         }
         teclado.close();
        
    }
}
