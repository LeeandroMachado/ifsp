import java.util.Scanner;

class Exercicio6 {
    public static void main(String[] args) {
        boolean prime = true;
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = scan.nextInt();

        if (n <= 1) {
            System.out.println("O número deve ser maior que UM.");
            return;
        }

        for (int i = 2; i <= n; i++) {
            if ((n % i == 0) && (i != n) ) {
                prime = false;
                break;
            }
        }

		if (prime) {
			System.out.println("é primo");
		} else {
			System.out.println("não é primo");
		}
    }
}