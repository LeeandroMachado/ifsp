import java.util.Scanner;

class Exercicio9 {
    public static void main(String[] args) {
        int attempts = 0;
        boolean logged = false;
        Scanner scan = new Scanner(System.in);
        String login, password;

        do {
            attempts = attempts + 1;

            System.out.print("Digite o login: ");
            login = scan.next();

            System.out.print("Digite a senha: ");
            password = scan.next();

            logged = login.equals("IFSP") && password.equals("PosWEB");
        } while(!logged && attempts <= 2);

        if (logged) {
            System.out.println("Login efetuado com sucesso.");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}