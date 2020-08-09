import java.util.Scanner;
import java.util.Arrays;

class Exercicio15 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int[][] arr = new int[3][3];
        double det = 0;
        double diagPrin1, diagPrin2, diagPrin3, diagSec1, diagSec2, diagSec3;

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

        diagPrin1 = arr[0][0] * arr[1][1] * arr[2][2];
        diagPrin2 = arr[0][1] * arr[1][2] * arr[2][0];
        diagPrin3 = arr[0][2] * arr[1][0] * arr[2][1];
        
        diagSec1 = arr[2][0] * arr[1][1] * arr[0][2];
        diagSec2 = arr[2][1] * arr[1][2] * arr[0][0];
        diagSec3 = arr[2][2] * arr[1][0] * arr[0][1];
        
        det = -(diagSec1 + diagSec2 + diagSec3) + (diagPrin1 + diagPrin2 + diagPrin3);

        System.out.println("O determinante da matriz é : " + det);
    }
}