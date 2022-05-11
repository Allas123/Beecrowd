package iniciante.bee1018;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor;
        int cedulasCem;
        int cedulasCinquenta;
        int cedulasVinte;
        int cedulasDez;
        int cedulasCinco;
        int cedulasDois;
        int cedulasUm;

        valor = input.nextInt();

        System.out.printf("%d%n", valor);

        cedulasCem  = valor / 100;
        valor  = valor % 100;

        cedulasCinquenta  = valor / 50;
        valor  = valor % 50;

        cedulasVinte  = valor / 20;
        valor  = valor % 20;

        cedulasDez  = valor / 10;
        valor  = valor % 10;

        cedulasCinco  = valor / 5;
        valor  = valor % 5;

        cedulasDois  = valor / 2;
        valor  = valor % 2;

        cedulasUm  = valor;

        System.out.printf("%d nota(s) de R$ 100,00%n", cedulasCem);
        System.out.printf("%d nota(s) de R$ 50,00%n", cedulasCinquenta);
        System.out.printf("%d nota(s) de R$ 20,00%n", cedulasVinte);
        System.out.printf("%d nota(s) de R$ 10,00%n", cedulasDez);
        System.out.printf("%d nota(s) de R$ 5,00%n", cedulasCinco);
        System.out.printf("%d nota(s) de R$ 2,00%n", cedulasDois);
        System.out.printf("%d nota(s) de R$ 1,00%n", cedulasUm);

        input.close();
    }
}
