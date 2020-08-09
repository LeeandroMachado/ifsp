import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

class Exercicio3 {
    public static void main(String[] args) {
        double v1, v2;
        double result;
        int type;
        Scanner scan; 
        
        scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.print("Digite um número: ");
        v1 = scan.nextDouble();

        System.out.print("Digite outro número: ");
        v2 = scan.nextDouble();

        System.out.print("Escolha a operação: 1-Somar 2-Subtrair 3-Multiplicar 4-Dividir: ");
        type = scan.nextInt();

        switch (type) {
            case 1:
                result = v1 + v2;
                break;
            case 2:
                result = v1 - v2;
                break;
            case 3: 
                result = v1 * v2;
                break;
            case 4:
                result = v1 / v2;
                break;
            default:
                result = 0;
        }

        JOptionPane.showMessageDialog(null, "O resultado é: " + result);
    }
}