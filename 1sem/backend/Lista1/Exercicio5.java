import java.util.Scanner;

class Exercicio5 {
    public static void main(String[] args) {
        int n1, n2, interval, iteration = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        n1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = scan.nextInt();

        if (n1 <= 0 || n2 <= 0) {
            System.out.println("Números devem ser maiores que ZERO.");
            return;
        } else if (n1 == n2) {
            System.out.println("Números devem ser diferentes.");
            return;
        }

        interval = n1;

        while(interval < n2) {
            interval = n1 + iteration;

            System.out.print("\n");

            for(int i = 1; i <= 10; i++) {
                System.out.print(interval * i + " ");
            }

            System.out.print("\n\n");

            iteration++;
        }
    }
}