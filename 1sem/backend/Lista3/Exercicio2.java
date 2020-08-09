import java.util.Scanner;

class Exercicio2 {
  class Calc {
    private boolean isPrime(int number) {
      for(int j = 2; j < number; j++) {
        if (number % j == 0) {
          return false;
        }
      }

      return true;
    }

    public int primeCounter(int first, int last) {
      int count = 0;

      for(int i = first; i <= last; i++) {
        if (isPrime(i)) {
          count++;
        }
      }

      return count;
    }
  }

  public void calculate(Scanner scn) throws Exception {
    Calc calc = new Calc();

    System.out.print("Digite o primeiro número: ");
    int first = scn.nextInt();

    System.out.print("Digite o segundo número: ");
    int last = scn.nextInt();

    if (last < first) {
      throw new Exception("Último número deve ser maior que o primeiro.");
    }

    System.out.println("\n");
    System.out.println("A quantidade de números primos é: " + calc.primeCounter(first, last));
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    Exercicio2 ex = new Exercicio2();

    try {
      ex.calculate(scn);
    } catch (Exception err) {
      System.out.println(err);
    }
  }
}