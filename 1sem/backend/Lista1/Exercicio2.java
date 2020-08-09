import java.util.Locale;
import java.util.Scanner;

class Exercicio2 {
    public static void main(String[] args) {
        double height;
        double weight;
        double imc;
        String results[] = { "Desnutrição", "Abaixo do peso", "Peso normal", "Sobrepeso", "Obesidade" };
        Scanner scan;

        scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.print("Digite o seu peso (kg): ");
        weight = scan.nextDouble();

        System.out.print("Digite a sua altura (m): ");
        height = scan.nextDouble();

        imc = weight / (height * height);

        if (imc >= 16.6 && imc <= 18.5) {
            System.out.println(results[1]);
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println(results[2]);
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println(results[3]);
        } else if (imc >= 30) {
            System.out.println(results[4]);
        } else {
            System.out.println(results[0]);
        }
    }
}