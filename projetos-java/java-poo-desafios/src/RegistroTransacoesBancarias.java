
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double saldo = teclado.nextDouble();
        int qtdTransacao = teclado.nextInt();
        List<Transacoes> transacoes = new ArrayList<>();

        for (int x = 0; x < qtdTransacao ; x++) {
            char tipos = teclado.next().charAt(0);
            
            if(tipos == 'D' || tipos == 'd'){
                double valor = teclado.nextDouble();
                saldo += valor;
                transacoes.add(new Transacoes(tipos, valor));  
            }else if(tipos == 'S' || tipos == 's'){
                double valor = teclado.nextDouble();
                saldo -= valor;
                transacoes.add(new Transacoes(tipos, valor));
            }else{
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                x--;
            }
        }

        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes:");
        int i = 1; 
        for (Transacoes transacao : transacoes) {
            System.out.println(i + ". " + transacao);
            i++;
        }
        teclado.close();
    }
}
class Transacoes {
    private char  tipos;
    private double valor;

    public Transacoes(char tipos, double valor) {
        this.tipos = tipos;
        this.valor = valor;
    }

    public char getTipos() {
        return tipos;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (tipos == 'D' || tipos == 'd'){
            sb.append("Deposito de ");
        }else{
            sb.append("Saque de ");
        }
        sb.append(valor);
        return sb.toString();
    }



}

