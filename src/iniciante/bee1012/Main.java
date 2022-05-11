package iniciante.bee1012;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;

        double areaTrianguloRetangulo;
        double areaCirculo;
        double areaTrapezio;
        double areaQuadrado;
        double areaRetangulo;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        areaTrianguloRetangulo = ((1.0/2.0) * (a * c));
        areaCirculo = (3.14159 * Math.pow(c, 2));
        areaTrapezio = ((c * (a + b)) / 2);
        areaQuadrado =  Math.pow(b, 2);
        areaRetangulo = (a * b);

        System.out.printf("TRIANGULO: %.3f%n" , areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n" , areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n" , areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n" , areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n" , areaRetangulo);

        input.close();
    }
}
