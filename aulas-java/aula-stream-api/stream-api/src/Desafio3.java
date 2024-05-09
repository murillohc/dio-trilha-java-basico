import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(-1, -12, -17, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*numeros.stream()
            .allMatch(n -> n >= 0);*/
        Predicate<Integer> verificaPositivo = n -> {
            if(n >= 0){
                System.out.println("Número positivo");
                return true;

            }else{
                System.out.println("número negativo.");
                return true;
            }
        };
          numeros.stream()
            .filter(verificaPositivo)
            .forEach(System.out::println);
            
    }
}
