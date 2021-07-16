import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lists {
    
    public static void main(String[] args) {

        System.out.println("Crie uma lista com as 5 notas do aluno: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(5.0);
        notas.add(7.5);
        notas.add(8.9);
        notas.add(9.5);
        notas.add(9.5);
        System.out.println(notas.toString());

        System.out.println("Exiba a posicao da nota 7.5: " + notas.indexOf(7.5d));

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma das notas: " + soma);

        System.out.println("Exiba a média das notas: " + soma/notas.size());

        System.out.println("Remova a nota 6.0: ");
        notas.remove(6d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 1: ");
        notas.remove(1);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7.0 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}
