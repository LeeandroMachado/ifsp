
class Exercicio3 {
  class Sobrecarga {
    public double calcular(double x) {
      return Math.PI * Math.pow(x, 2);
    }

    public double calcular(double x, double y) {
      return x * y;
    }

    public double calcular(int x, int y, int z) {
      return x + y + z;
    }

    public double calcular(int x, double y) {
      return (x * y) / 2; 
    }

    public String calcular(String x) {
      return "Uso incorreto";
    }
  }

  public void calculos() {
    Sobrecarga sb = new Sobrecarga();

    System.out.println("Circulo: " + sb.calcular(1.50));
    System.out.println("Quadrado: " + sb.calcular(1.50, 1.75));
    System.out.println("Triangulo: " + sb.calcular(1, 2, 3));
    System.out.println("Area Triangulo: " + sb.calcular(1, 2.55));
    System.out.println("Erro: " + sb.calcular("TEETETET"));
  }

  public static void main(String[] args) {
    Exercicio3 ex = new Exercicio3();
    ex.calculos();
  }
}