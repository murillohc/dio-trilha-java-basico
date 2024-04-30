
import java.util.Scanner;


public class SimulacaoBancaria {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        double saldo = 0;

        System.out.println("Seja bem vindo(a), ao Banco MHC, o maior banco do mundo.");
        while (true) { 
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1- Depositar.");
            System.out.println("2- Sacar.");
            System.out.println("3- Consultar Saldo.");
            System.out.println("0- Encerrar.");
            
            int opcao = teclado.nextInt();
            switch (opcao) {
                 case 0:
                    System.out.println("O sistema foi encerrado.");
                    System.exit(opcao);

                 case 1:
                    System.out.println("Insira o valor do depósito em R$: ");
                    Double deposito = teclado.nextDouble();
                    saldo += deposito;     
                    break;
                case 2:
                    System.out.println("Insira o valor que deseja sacar em R$: ");
                    double saque = teclado.nextDouble();
                    if(saque > saldo){
                        System.out.println("O saldo é insuficiente.");

                    }else {
                        saldo = saldo - saque;
                        System.out.println("O valor de R$" + saque +" foi sacado da conta.");
                    }

                    break;
                case 3:
                    System.out.println("O saldo atual da conta é R$" + saldo);
                    break; 
                default:
                    System.out.println("Opção inválida. Tente novamente: ");
            }
            
        }


    }
}
