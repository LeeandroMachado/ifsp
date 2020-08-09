
class Exercicio4 {
  class Calculos {
    public int soma(int x, int y) {
      return x + y;
    }

    public int subtracao(int x, int y) {
      return x - y;
    }

    public int multiplicacao(int x, int y) {
      return x * y;
    }

    public double radiciacao(int x) {
      return Math.sqrt(x);
    }

    public int fatorial(int x) {
      if (x == 0) {
        return 1;
      }

      return x * fatorial(x-1);
    }
  }

  public void calculos() {
    Calculos calc = new Calculos();

    System.out.println("soma: " + calc.soma(1, 5));
    System.out.println("subtracao: " + calc.subtracao(5, 1));
    System.out.println("multiplicacao: " + calc.multiplicacao(5, 2));
    System.out.println("radiciacao: " + calc.radiciacao(81));
    System.out.println("fatorial: " + calc.fatorial(5));
  }

  public static void main(String[] args) {
    Exercicio4 ex = new Exercicio4();
    ex.calculos();
  }
}