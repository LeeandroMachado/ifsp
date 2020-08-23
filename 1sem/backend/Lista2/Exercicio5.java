import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class Exercicio5 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scn = new Scanner(System.in);
        String firstDate = "", secondDate = "";

        System.out.print("Digite a data de nascimento: ");
        firstDate = scn.nextLine();

        System.out.print("Digite outra data de nascimento: ");
        secondDate = scn.nextLine();

        try {
            Date current = dateFormat.parse("11/03/2020");
            Date date1 = dateFormat.parse(firstDate);
            Date date2 = dateFormat.parse(secondDate);

            long diff = date2.getTime() - date1.getTime();
            
            System.out.println ("Dias: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
            System.out.println ("Idade 1: " + TimeUnit.DAYS.convert((current.getTime() - date1.getTime()), TimeUnit.MILLISECONDS) / 365);
            System.out.println ("Idade 2: " + TimeUnit.DAYS.convert((current.getTime() - date2.getTime()), TimeUnit.MILLISECONDS) / 365);
        } catch (Exception e) {
            System.out.println ("ERRO");
        }
    }
}