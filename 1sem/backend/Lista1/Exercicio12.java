class Exercicio12 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int t = 0; t < 10; t++) {
                if (i == t) {
                    arr[i][t] = 1;
                } else if (t < i) {
                    arr[i][t] = 2;
                } else {
                    arr[i][t] = 0;
                }

                System.out.print(" " + arr[i][t] + " ");
            }
            System.out.println("");
        }
    }
}