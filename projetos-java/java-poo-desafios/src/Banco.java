
import java.text.DecimalFormat;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String titular = teclado.next();
        int numeroConta = teclado.nextInt();
        double saldo = teclado.nextDouble();
        double taxaJuros = teclado.nextDouble();

        ContaBancaria contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta poupanca:");
        contaPoupanca.exibirInformacoes();
    }
    
}
class ContaBancaria{
    protected int numero;
    protected String titular;
    protected double saldo; 

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    public void exibirInformacoes(){
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }

}
class ContaPoupanca extends ContaBancaria{
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }
    

    @Override
    public void exibirInformacoes() {
        // TODO Auto-generated method stub
        super.exibirInformacoes();
        System.out.println("Taxa de juros: " + taxaJuros +"%");
    }

   
    


}
