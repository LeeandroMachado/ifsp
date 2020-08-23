import java.lang.Math;
import java.util.Scanner;

class Exercicio7 {
    public static void main(String[] args) {
        int n, random, attempts = 0;
        Scanner scan = new Scanner(System.in);

        random = (int) (Math.random() * 10);

        do {
            attempts++;
            System.out.print("Digite um número: ");
            n = scan.nextInt();
        } while(n != random);

        System.out.println("Você acertou, o número sorteado é: " + random + " em " + attempts + " tentativas.");
    }
}