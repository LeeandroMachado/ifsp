import java.util.Scanner;

class Exercicio7 {
  static public boolean validateCPF (String cpf) {
      if (cpf.matches("^(.)\\1*$")) {
        return false;
      }
      
      int     d1, d2;
      int     digito1, digito2, resto;
      int     digitoCPF;
      String  nDigResult;

      d1 = d2 = 0;
      digito1 = digito2 = resto = 0;

      for (int nCount = 1; nCount < cpf.length() -1; nCount++) {
         digitoCPF = Integer.valueOf (cpf.substring(nCount -1, nCount)).intValue();
         d1 = d1 + ( 11 - nCount ) * digitoCPF;
         d2 = d2 + ( 12 - nCount ) * digitoCPF;
      };

      resto = (d1 % 11);

      if (resto < 2) {
        digito1 = 0;
      } else {
        digito1 = 11 - resto;
      }

      d2 += 2 * digito1;
      resto = (d2 % 11);

      if (resto < 2) {
        digito2 = 0;
      } else {
        digito2 = 11 - resto;
      }

      String nDigVerific = cpf.substring (cpf.length()-2, cpf.length());
      nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

      return nDigVerific.equals(nDigResult);
   }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = scn.nextLine();

        if (validateCPF(cpf.replaceAll("[^0-9]", ""))) {
          System.out.println("CPF Válido");
        }
    }
}