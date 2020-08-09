import java.util.Locale;
import java.util.Scanner;

class Exercicio1 {
    public static void main(String[] args) {
        String name;
        String address;
        double value;
        String date;
        Scanner scan;

        scan = new Scanner(System.in);
        
        scan.useLocale(Locale.US);

        System.out.print("Digite o seu nome: ");
        name = scan.nextLine();
        
        System.out.print("Digite o seu endereço: ");
        address = scan.nextLine();

        System.out.print("Digite o valor da compra: ");
        value = scan.nextDouble();

        System.out.print("Digite a data da compra: ");
        date = scan.next();

        System.out.println("\n\n");

        System.out.println("\t\t\tAVISO\n");
        System.out.println("Caro cliente Sr(a) " + name + ", os produtos da sua compra no ");
        System.out.println("valor de R$ " + value + " serão entregues no endereço abaixo:");
        System.out.println("Rua " + address + ".");
        System.out.println("Data da Entrega: " + date + ".");
        System.out.println("******************** Obrigado pela Preferência! **********************\n\n");
    }
}