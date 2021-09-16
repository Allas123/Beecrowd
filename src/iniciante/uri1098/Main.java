package iniciante.uri1098;

public class Main {

    public static void main(String[] args) {

        double a = 1.0;
        double b = 2.0;
        double c = 3.0;

        for (double i = 0.0; i < 2.2; i += 0.2) {
            if (0.0 == i || i == 1 || i >= 2.0) {
                System.out.printf("I=%d J=%d%n", (int) i, (int) a);
                System.out.printf("I=%d J=%d%n", (int) i, (int) b);
                System.out.printf("I=%d J=%d%n", (int) i, (int) c);

            } else if (i <= 1.8) {
                System.out.printf("I=%.1f J=%.1f%n", i, a);
                System.out.printf("I=%.1f J=%.1f%n", i, b);
                System.out.printf("I=%.1f J=%.1f%n", i, c);
            }

            a += 0.201;
            b += 0.201;
            c += 0.201;
        }
    }
}
