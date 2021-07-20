import java.util.function.Supplier;

public class Suplidores {
    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        /* ou:
        Supplier<Pessoa> instanciaPessoa = Pessoa::new; 
        */
        System.out.println(instanciaPessoa.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa() {
        nome = "Camila";
        idade = 19;
    }

    @Override
    public String toString() {
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}
