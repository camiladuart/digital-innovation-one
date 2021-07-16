public class Arrays {
    
    public static void main(String[] args) {
        //declaração de arrays:
        int[] meuArray = new int[7];
        int[] meuArray2 = {1, 2, 3, 4, 5, 6, 7};
        int[][] meuArrayMulti = { {1, 2, 3, 4}, {5, 6, 7, 8} };

        System.out.println("Array 1: " + meuArray);

        System.out.println("Array 2: ");
        for (int i = 0; i < 7; i++) {
            System.out.println(meuArray2[i]);
        }

        //alterando um alemento:
        meuArray2[1] = 10;
        System.out.println("Novo elemento: " + meuArray2[1]);

        //comprimento do array:
        System.out.println("Comprimento do array = " + meuArray.length);

        System.out.println("Array Multidimensional: ");
        for (int i = 0; i < meuArrayMulti.length; ++i) {
            for (int j = 0; j < meuArrayMulti[i].length; ++j) {
                System.out.println(meuArrayMulti[i][j]);
            }
        }
    }
}