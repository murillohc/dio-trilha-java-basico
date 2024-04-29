import java.util.Scanner;

public class BancoDigital {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Seja bem vindo(a) ao banco MHC!");
        System.out.println("Digite seu nome: ");
        String nome= ler.nextLine();
        System.out.println("Digite sua agência: ");
        String agencia= ler.nextLine();
        System.out.println("Insira seu número de usuário: ");
        int numero= ler.nextInt();
        System.out.println("Insira o valor em R$ que deseja depositar: ");
        Double saldo= ler.nextDouble();

        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero +" e seu saldo " + saldo +" já está disponível para saque");

        
    }
}
