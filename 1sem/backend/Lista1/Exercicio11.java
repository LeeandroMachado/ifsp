import java.util.Random;

class Exercicio11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = random.ints(1000, 10, 1000).toArray();
        float counter = 0;

        for(int i = 0; i < arr.length; i++) {
            counter = (arr[i] >= 700) ? counter + 1 : counter;
        }

        System.out.println("Porcentagem de números maiores ou iguais a 700: " + (counter / arr.length) * 100);
    }
}