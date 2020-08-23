import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Exercicio5 {
  class DateCalc {
    String startDate;
    String endDate;

    public DateCalc(String startDate, String endDate) {
      this.startDate = startDate;
      this.endDate = endDate;
    }

    public long showDaysDiff() {
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      
      try {
        Date date1 = dateFormat.parse(this.startDate);
        Date date2 = dateFormat.parse(this.endDate);
  
        long diff = date2.getTime() - date1.getTime();
        
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
      } catch (Exception e) {
        System.out.println ("ERRO");
        return 0;
      }
    }
  }

  public void calculateDays(String startDate, String endDate) {
    DateCalc dc = new DateCalc(startDate, endDate);
    System.out.println("Diferença de " + dc.showDaysDiff() + " dias");
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String firstDate = "", secondDate = "";
    Exercicio5 ex = new Exercicio5();

    System.out.print("Digite a primeira data: ");
    firstDate = scn.nextLine();

    System.out.print("Digite a segunda data: ");
    secondDate = scn.nextLine();

    ex.calculateDays(firstDate, secondDate);
  }
}