import java.lang.Math;
import java.util.Scanner;

class Exercicio3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite o raio: ");

        double radius = scn.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("%.3f", area);
    }
}