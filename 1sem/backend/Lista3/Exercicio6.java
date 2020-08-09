import java.util.Scanner;

class Exercicio6 {
  class CPF {
    String number;

    public CPF(String number) {
      this.number = number;
    }

    public boolean valid() {
      if (this.number.matches("^(.)\\1*$")) {
        return false;
      }
      
      int     d1, d2;
      int     digito1, digito2, resto;
      int     digitoCPF;
      String  nDigResult;

      d1 = d2 = 0;
      digito1 = digito2 = resto = 0;

      for (int nCount = 1; nCount < this.number.length() -1; nCount++) {
         digitoCPF = Integer.valueOf (this.number.substring(nCount -1, nCount)).intValue();
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

      String nDigVerific = this.number.substring (this.number.length()-2, this.number.length());
      nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

      return nDigVerific.equals(nDigResult);
    }
  }

  public void validateCPF(String number) {
    CPF cpf = new CPF(number);

    if (cpf.valid()) {
      System.out.println("CPF Válido");
    } else {
      System.out.println("CPF Invalido");
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    Exercicio6 ex = new Exercicio6();

    System.out.println("Digite o CPF: ");
    ex.validateCPF(scn.nextLine().replaceAll("[^0-9]", ""));
  }
}