package iniciante.uri1045;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float a;
        float b;
        float c;
        float maior;
        float meio;
        float menor;

        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();

        maior = Math.max(a, Math.max(b, c));

        if (maior == a) {
            meio = Math.max(b, c);
            menor = Math.min(b, c);

        } else if (maior == b) {
            meio = Math.max(a, c);
            menor = Math.min(a, c);

        } else {
            meio = Math.max(a, b);
            menor = Math.min(a, b);
        }

        if (maior >= meio + menor) {
            System.out.printf("NAO FORMA TRIANGULO%n");

        } else if ((maior * maior) == (meio * meio) + (menor * menor)) {
            System.out.printf("TRIANGULO RETANGULO%n");

        } else if ((maior * maior) > (meio * meio) + (menor * menor)) {
            System.out.printf("TRIANGULO OBTUSANGULO%n");

        } else if ((maior * maior) < (meio * meio) + (menor * menor)) {
            System.out.printf("TRIANGULO ACUTANGULO%n");

        }if (maior ==  meio && meio == menor && menor == maior) {
            System.out.printf("TRIANGULO EQUILATERO%n");

        }if (( maior == meio && maior != menor) ||
                (maior == menor && maior != meio) ||
                menor == meio && menor != maior) {
            System.out.printf("TRIANGULO ISOSCELES%n");
        }

        input.close();
    }
}
