import java.util.Arrays;
import java.util.List;

public class Desafio1 {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Consumer<Integer> imprimirNumeros = (num -> System.out.println(num));
        //As duas formas conseguem imprimir os números
        numeros.stream().forEach(n -> System.out.println(n));
            
    }
}
