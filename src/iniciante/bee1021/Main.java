package iniciante.bee1021;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float valor;
        float notaCem;
        float notaCinquenta;
        float notaVinte;
        float notaDez;
        float notaCinco;
        float notaDois;
        float notaUm;
        float cinquenta_centavos;
        float vinte_c_centavos;
        float dez_centavos;
        float cinco_centavos;
        float um_centavos;

        valor = input.nextFloat();

        notaCem =  (valor / 100.0f);
        valor %= 100.0f;
        notaCinquenta = (valor / 50.0f);
        valor %= 50.0f;
        notaVinte = (valor / 20.0f);
        valor %= 20.0f;
        notaDez = (valor / 10.0f);
        valor %= 10.0f;
        notaCinco = (valor / 5.0f);
        valor %= 5.0f;
        notaDois = (valor / 2.0f);
        valor %=  2.0f;
        notaUm = valor;
        valor %=  1.0f;
        cinquenta_centavos = (valor / 0.50f);
        valor %=  0.50f;
        vinte_c_centavos = (valor / 0.25f);
        valor %=  0.25f;
        dez_centavos = (valor / 0.10f);
        valor %= 0.10f;
        cinco_centavos = (valor / 0.05f);
        valor %= 0.05f;
        um_centavos = Math.round(valor / 0.01f);

        System.out.printf("NOTAS:%n");
        System.out.printf("%d nota(s) de R$ 100.00%n", (int)(notaCem));
        System.out.printf("%d nota(s) de R$ 50.00%n",  (int)(notaCinquenta));
        System.out.printf("%d nota(s) de R$ 20.00%n", (int)(notaVinte));
        System.out.printf("%d nota(s) de R$ 10.00%n", (int)(notaDez));
        System.out.printf("%d nota(s) de R$ 5.00%n", (int)(notaCinco));
        System.out.printf("%d nota(s) de R$ 2.00%n", (int)(notaDois));
        System.out.printf("MOEDAS:%n");
        System.out.printf("%d moeda(s) de R$ 1.00%n", (int)(notaUm));
        System.out.printf("%d moeda(s) de R$ 0.50%n", (int)(cinquenta_centavos));
        System.out.printf("%d moeda(s) de R$ 0.25%n", (int)(vinte_c_centavos));
        System.out.printf("%d moeda(s) de R$ 0.10%n", (int)(dez_centavos));
        System.out.printf("%d moeda(s) de R$ 0.05%n", (int)(cinco_centavos));
        System.out.printf("%d moeda(s) de R$ 0.01%n", (int)(um_centavos));

        input.close();
    }
}
