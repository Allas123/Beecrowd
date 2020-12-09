package iniciante.uri1012;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;

        // a área do triângulo retângulo que tem com a variável a por base e a variável c por altura
        double areaTrianguloRetangulo;

        // a área do círculo que tem com variável c por raio
        double areaCirculo;

        // a área do trapézio que tem  com as variávies a e b por bases e a variável c por altura
        double areaTrapezio;

        // a área do quadrado que tem com a variável b por lado
        double areaQuadrado;

        // a área do retângulo que tem com as variáveis a e b por lados
        double areaRetangulo;

        // lendo números fornecido pelo usuário, depois  armazenar na variáveis corrrespondente
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        // calculo das areas
        areaTrianguloRetangulo = ((1.0/2.0) * (a * c));
        areaCirculo = (3.14159 * Math.pow(c, 2));
        areaTrapezio = ((c * (a + b)) / 2);
        areaQuadrado =  Math.pow(b, 2);
        areaRetangulo = (a * b);

        System.out.printf("TRIANGULO: %.3f%n" , areaTrianguloRetangulo); // exibe o valor da variável areaTrianguloRetangulo
        System.out.printf("CIRCULO: %.3f%n" , areaCirculo); // exibe o valor da variável areaCirculo
        System.out.printf("TRAPEZIO: %.3f%n" , areaTrapezio); // exibe o valor da variável areaTrapezio
        System.out.printf("QUADRADO: %.3f%n" , areaQuadrado); // exibe o valor da variável areaQuadrado
        System.out.printf("RETANGULO: %.3f%n" , areaRetangulo); // exibe o valor da variável areaRetangulo

        // fechar input
        input.close();

    }
}
