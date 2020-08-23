import java.util.Arrays;

class Exercicio14 {
    public boolean isPrime(int number) {
        boolean prime = true;

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number; i++) {
            if ((number % i == 0) && (i != number) ) {
                prime = false;
                break;
            }
        }

        return prime;
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        String[] arrT = new String[100];
        Exercicio14 ex = new Exercicio14();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            arrT[i] = String.valueOf(arr[i]);

            if (ex.isPrime(arr[i])) {
                arrT[i] = arrT[i] + "*";
            }
        }

        System.out.println("\n");

        for (int original: arr) {
            System.out.print(original + " ");
        }

        System.out.println("\n\n");

        for (String primes : arrT) {
            System.out.print(primes + " ");
        }
    }
}