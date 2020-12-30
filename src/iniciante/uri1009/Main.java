package iniciante.uri1009;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nomeVendedor;
        double salarioFixo;
        double totalVendasPorMes;
        double  COMISSAO_VENDAS = 0.15;
        double totalReceberFinalMes;

        nomeVendedor = input.next();
        salarioFixo = input.nextDouble();
        totalVendasPorMes = input.nextDouble();

        totalReceberFinalMes = (salarioFixo + (totalVendasPorMes * COMISSAO_VENDAS));

        System.out.printf("TOTAL = R$ %.2f%n", totalReceberFinalMes);

        input.close();
    }
}
