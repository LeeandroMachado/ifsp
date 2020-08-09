import java.util.Scanner;

class Exercicio10 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int evensCount = 0, oddsCount = 0, sumEvens = 0, sumOdds = 0;
        double averageOdds = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            numbers[i] = scan.nextInt();

            if (numbers[i] % 2 == 0) {
                evensCount = evensCount + 1;
                sumEvens = sumEvens + numbers[i];
            } else {
                oddsCount = oddsCount + 1;
                sumOdds = sumOdds + numbers[i];
                averageOdds = sumOdds / oddsCount;
            }
        }

        System.out.println("\nForam inseridos " + evensCount + " números pares.");
        System.out.println("Foram inseridos " + oddsCount + " números ímpares.");
        System.out.println("A soma dos números pares é: " + sumEvens);
        System.out.println("A média dos números ímpares é: " + averageOdds + "\n");
    }
}