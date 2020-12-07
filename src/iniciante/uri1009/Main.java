package iniciante.uri1009;

import java.util.Scanner;

public class Main {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        String nomeVendedor;
        double salarioFixo;
        double totalVendasPorMes;
        double comissaoVendas = 0.15;
        double totalReceberFinalMes; // salario final do vendedor com comissão


        // lendo número fornecido pelo usuário, depois  armazenar na variáveis corrrespondente
        nomeVendedor = input.next();
        salarioFixo = input.nextDouble();
        totalVendasPorMes = input.nextDouble();

        // fazendo o cálculo do salário do vendedor
        totalReceberFinalMes = (salarioFixo + (totalVendasPorMes * comissaoVendas));

        System.out.printf("TOTAL = R$ %.2f%n", totalReceberFinalMes); // exibe o valor da variável totalReceberFinalMes

        // fechar input
        input.close();
    }
}
