import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class OrdenacaoList {
    
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Black", 18, "preto"));
            add(new Gato("Brown", 14, "marrom"));
            add(new Gato("White",  10, "branco"));
        }};
        System.out.println(gatos);

        System.out.println("--\tOrdem de Insercao\t--");
        System.out.println(gatos);

        System.out.println("--\tOrdem de Aleatoria\t--");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("--\tOrdem Natural (nome)\t--");
     // Collections.sort(gatos, new ComparatorNome());
        gatos.sort(new ComparatorNome());
        System.out.println(gatos);

        System.out.println("--\tOrdem Idade\t--");
     // Collections.sort(gatos, new ComparatorIdade()); 
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("--\tOrdem Cor\t--");
     // Collections.sort(gatos, new ComparatorCor()); 
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t--");
     // Collections.sort(gatos, new ComparatorNomeCorIdade());
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);
    }
}

class Gato {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '/' +
                ", idade=" + idade + 
                ", cor='" + cor + '/' + 
                '}';
    }
}

class ComparatorNome implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getNome().compareToIgnoreCase(g2.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {

        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) { // se não forem iguais
            return nome;
        }

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) { // se não forem iguais
            return cor;
        }

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}