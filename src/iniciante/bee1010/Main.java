package iniciante.bee1010;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int codigoDePecaUm;
        int numeroDePecasUm;
        double valorUnitarioDeCadaPecaUm;
        int codigoDePecaDois;
        int numeroDePecasdois;
        double valorUnitarioDeCadaPecaDois;
        double valorSerPago;

        codigoDePecaUm = input.nextInt();
        numeroDePecasUm = input.nextInt();
        valorUnitarioDeCadaPecaUm = input.nextDouble();
        codigoDePecaDois = input.nextInt();
        numeroDePecasdois = input.nextInt();
        valorUnitarioDeCadaPecaDois = input.nextDouble();

        valorSerPago = (( numeroDePecasUm * valorUnitarioDeCadaPecaUm ) + (numeroDePecasdois * valorUnitarioDeCadaPecaDois));

        System.out.printf("VALOR A PAGAR: R$ %.2f%n" , valorSerPago);

        input.close();
    }
}
