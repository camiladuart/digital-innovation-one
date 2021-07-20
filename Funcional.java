import java.util.function.UnaryOperator;
import java.util.Arrays;

public class Funcional {
    public static void main(String[] args) {
        UnaryOperator<Integer> calcularNumVezesTres = num -> num*3;
        int num = 10;
        System.out.println("O resultado eh " + calcularNumVezesTres.apply(num));

        int[] valores = {1, 2, 3, 4};
        //funcional: +legibilidade
        Arrays.stream(valores)
            .filter(numero -> numero % 2 == 0) //pra cada numero cujo mod 2 é 0:
            .map(numero -> numero * 2)         //multiploca por 2
            .forEach(numero -> System.out.println(numero)); // e imprime
    
        /* imperativo:
        for (int i = 0; i < valores.length; i++) {
            int valor = 0;
            if (valores[i] % 2 == 0) {
                valor = valores[i] * 2;
                if (valor != 0) {
                    System.out.println(valor);
                }
            }
        }
        */
    }
}
