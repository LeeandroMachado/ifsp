import java.util.Scanner;

class Exercicio2 {
    public String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Exercicio2 ex = new Exercicio2();

        System.out.print("Digite uma frase: ");
        String phrase = scn.nextLine();

        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());
        System.out.println(ex.reverse(phrase));
        System.out.println(phrase.split("\\s")[1]);
        System.out.println(phrase.split("\\s")[1].replaceAll(".", "*"));
    }
}