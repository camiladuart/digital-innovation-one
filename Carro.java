import java.util.Scanner;

public class Carro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ano;
        String marca;
        String modelo;

        System.out.print("Entre com a marca do carro: ");
        marca = sc.next();
        System.out.print("Entre com o modelo do carro: ");
        modelo = sc.next();
        System.out.print("Entre com o ano do carro: ");
        ano = sc.nextInt();

        System.out.println("------------------------------------ ");
        System.out.println("A marca do carro eh: " + marca);
        System.out.println("O modelo do carro eh: " + modelo);
        System.out.println("O ano do carro eh: " + ano);
        System.out.println("------------------------------------ ");

        sc.close();
    }
}
