import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o saldo atual da sua conta bancaria: ");
        double saldo = teclado.nextDouble();
        System.out.println("Insira o valor que deseja sacar da conta: ");
        double saque = teclado.nextDouble();
        double limiteChequeEspecial = 500;

        if(saldo >= saque){
            System.out.println("Transação realizada com sucesso.");
        }else if((saldo + limiteChequeEspecial) >= saque){
            System.out.println("Transação realizada com sucesso utilizando o cheque especial."); 

        }else{
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
        }

        teclado.close();
    }
}
