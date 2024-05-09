import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio5 {
    public static void main(String[] args) {
         List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

         List<Integer> numerosMaior5 = numeros.stream()
         .filter(n -> n > 5)
         .collect(Collectors.toList());

         System.out.println("Os números maiores que 5 são: " + numerosMaior5);

         Integer somaMedia = numerosMaior5.stream()
         .reduce(0, Integer::sum); 

         if(!numerosMaior5.isEmpty()){
            Integer media = somaMedia / numerosMaior5.size();
            System.out.println("A média da soma dos : " + media);
         }else{
            System.out.println("A lista está vazia.");
         }
    }
}
