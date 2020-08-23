import java.util.Scanner;

class Exercicio6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String name = scn.nextLine();
        boolean nameValidation = name.matches("^[a-zA-Z]{3,}+ [a-zA-Z]{3,}$");
        System.out.println("Nome valido: " + nameValidation);

        System.out.print("Digite o e-mail: ");
        String email = scn.nextLine();
        boolean emailValidation = email.matches("^[a-z0-9][a-z0-9-_\\.]+@([a-z]|[a-z0-9]?[a-z0-9-]+[a-z0-9])\\.[a-z0-9]{2,10}(?:\\.[a-z]{2,10})?$");
        System.out.println("E-mail valido: " + emailValidation);

        System.out.print("Digite o CPF: ");
        String cpf = scn.nextLine();
        boolean cpfValidation = cpf.matches("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$");
        System.out.println("CPF valido: " + cpfValidation);

        System.out.print("Digite o CEP: ");
        String cep = scn.nextLine();
        boolean cepValidation = cep.matches("^\\d{2}[.]\\d{3}[-]\\d{3}$");
        System.out.println("CEP valido: " + cepValidation);

        System.out.print("Digite o Telefone: ");
        String phone = scn.nextLine();

        System.out.print("Digite o Celular: ");
        String cellphone = scn.nextLine();
        boolean phoneValidation = phone.matches("(\\(\\d{2}\\)\\s)(\\d{4,5}\\-\\d{4})") && cellphone.matches("(\\(\\d{2}\\)\\s)(\\d{4,5}\\-\\d{4})");        
        System.out.println("Celular ou Telefone validos: " + phoneValidation);

        if (!nameValidation && emailValidation && cpfValidation && cepValidation && phoneValidation) {
          System.out.println("Nome: " + name);
          System.out.println("E-mail: " + email);
          System.out.println("CPF: " + cpf);
          System.out.println("CEP: " + cep);
          System.out.println("Telefone: " + phone);
          System.out.println("Celular: " + cellphone);
        }
    }
}