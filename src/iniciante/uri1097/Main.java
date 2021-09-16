package iniciante.uri1097;

public class Main {

    public static void main(String[] args) {

        int a = 7;
        int b = 6;
        int c = 5;

        for(int i = 1; i <= 9; i+=2) {
            System.out.printf("I=%d J=%d%n", i, a);
            System.out.printf("I=%d J=%d%n", i, b);
            System.out.printf("I=%d J=%d%n", i, c);

            a += 2;
            b += 2;
            c += 2;
        }
    }
}
