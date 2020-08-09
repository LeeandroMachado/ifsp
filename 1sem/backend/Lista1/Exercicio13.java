import java.util.Scanner;
import java.util.Arrays;

class Exercicio13 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int[][] arr = new int[3][4];
        int[][] arrT = new int[4][3];

        for (int l = 0; l < arr.length; l++) {
            for (int c = 0; c < arr[l].length; c++) {
                System.out.printf("Insira o elemento M[%d][%d]: ", l, c);
                arr[l][c] = n.nextInt();
            }
        }

        System.out.println("\nA Matriz original: \n");

        for (int[] normal : arr) {
            System.out.println(Arrays.toString(normal));
        }

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 4; c++) {
                arrT[c][l] = arr[l][c];
            }
        }

        System.out.println("\nMatriz transposta: \n");
        
        for (int[] transp : arrT) {
            System.out.println(Arrays.toString(transp));
        }

        System.out.println("\n");
    }
}