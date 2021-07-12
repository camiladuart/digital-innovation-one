package Area;

public class Main {
    
    public static void main(String[] args) {
        Retangulo retangulo = new Quadrado();

        retangulo.setAltura(10);
        retangulo.setLargura(5);

        System.out.println("Area = " + retangulo.getArea());
    }
}

/* dá 25 e nao 50 porque na verdade o retangulo é um quadrado, e no método do quadrado falamos para
alterar os dois atributos, substituindo a largura para 5 também */
