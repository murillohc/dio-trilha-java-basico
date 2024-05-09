import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
        .filter(numero -> numero % 2 == 0)
        .collect(Collectors.toList());

        // Imprimir a lista resultante no console
        System.out.println("Lista original: " + numeros);
        System.out.println("Lista sem valores ímpares: " + numerosPares);
    }
}
