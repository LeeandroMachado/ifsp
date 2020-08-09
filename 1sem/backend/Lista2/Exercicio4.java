import java.util.Scanner;

class Exercicio4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        double price = 0;
        int installments = 1;
        double interests = 0;

        System.out.print("Digite o valor do produto: ");
        price = scn.nextDouble();

        System.out.print("Digite o numero de parcelas: ");
        installments = scn.nextInt();

        System.out.print("Digite a taxa de juros compostos: ");
        interests = scn.nextDouble();

        double total = price * (Math.pow((1 + interests/100), installments));

        System.out.printf("%s %.2f ", "R$", total);
    }
}