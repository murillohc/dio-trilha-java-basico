import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numeroRepetido = numeros.stream()
            .distinct()
            .count() == numeros.size();

        if(numeroRepetido){
            System.out.println("Não existem números repetidos nessa lista.");
        }else{
            System.out.println("Existem números repetidos nessa lista.");
        }
    }
}
