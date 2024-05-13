
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldo = teclado.nextDouble();
        int quantidadeTransacoes = teclado.nextInt();
        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = teclado.next().charAt(0); 
            double valorTransacao = teclado.nextDouble();
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao); 
            // Aqui é atualizado o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'D' || transacao.getTipo() == 'd') { 
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S' || transacao.getTipo() == 's') { 
                saldo -= valorTransacao; 
            }
        }
        System.out.println("\nSaldo : " + saldo); 
        System.out.println("\nTransacoes:"); 
        int i = 1;
        List<String> transacoesFormatadas = transacoes.stream()
                .map(transacao -> String.format("%c de %.1f", transacao.getTipo(), transacao.getValor()).replace("," , "."))
                .collect(Collectors.toList());
        transacoesFormatadas.forEach(System.out::println);





    }
}
class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}