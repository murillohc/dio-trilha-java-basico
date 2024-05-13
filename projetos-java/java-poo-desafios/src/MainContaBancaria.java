
import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double saldoInicial = teclado.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);
        double valorDeposito = teclado.nextDouble();
        conta.depositar(valorDeposito);
        System.out.printf("Saldo atual: %.1f\n", conta.getSaldo());
        double valorSaque = teclado.nextDouble();
        conta.sacar(valorSaque);
        System.out.printf("Saldo atual: %.1f\n", conta.getSaldo());
        teclado.close();
    }
}
class ContaBancaria{
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Deposito feito.");
    }
    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente. Saque não realizado.");
        }else{
            this.saldo -= valor;
            System.out.println("Saque feito.");
        }
    }

    public double getSaldo() {
        return saldo;
    }


}