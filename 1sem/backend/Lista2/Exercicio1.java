class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("LATINO: ");

        for (int i = 0; i < 26; i++) {
            System.out.print((char) (i + 65));
            System.out.print((char) (i + 97));
            System.out.println("");
        }

        System.out.println("");
        System.out.println("GREGO: ");

        for (int i = 0; i < 25; i++) {
            System.out.print((char) (i + 913));
            System.out.print((char) (i + 945));
            System.out.println("");
        }
    }
}