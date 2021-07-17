import java.util.ArrayList;
import java.util.List;
import java.util.Set;
//import java.util.function.Predicate;
//import java.util.function.DoubleConsumer;
//import java.util.function.ToIntFunction;
//import java.util.function.Consumer;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

//import javax.sql.rowset.Predicate;

public class StreamAPI {
    public static void main(String[] args) {

        List<String> numerosAleatorios = new ArrayList<String>();
        numerosAleatorios.add("1");
        numerosAleatorios.add("0");
        numerosAleatorios.add("4");
        numerosAleatorios.add("1");
        numerosAleatorios.add("3");
        numerosAleatorios.add("7");
        numerosAleatorios.add("2");

        System.out.println("Imprima todos os elementos da lista: ");
        //numerosAleatorios.stream().forEach(s -> System.out.println(s)); 
        // ou:
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e os coloque dentro de um set: ");
        Set<String> collectSet = numerosAleatorios.stream()
            .limit(5)
            .collect(Collectors.toSet());
        System.out.println(collectSet);

        System.out.println("Transforme os elementos da lista de String para Inteiros: ");
        List<Integer> collectList = numerosAleatorios.stream()
            .map(s -> Integer.parseInt(s))
            .collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("Pegue os numeros pares maiores que 2 e os coloque em uma lista:");
        List<Integer> listParesMaioresQueDois = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .filter(i -> (i % 2 == 0 && i > 2))
            .collect(Collectors.toList());
        System.out.println(listParesMaioresQueDois);

        System.out.println("Exiba a media dos numeros: ");
        numerosAleatorios.stream()
            .mapToInt(Integer::parseInt)
            .average()
            .ifPresent(System.out::println);

        System.out.println("Remova os valores impares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());
        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAleatoriosInteger);
    }
}
