package iniciante.uri1010;

import java.util.Scanner;

public class Main {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // criando as variáveis correspondente a sua utilização
        int codigoDePecaUm;
        int numeroDePecasUm;
        double valorUnitarioDeCadaPecaUm;
        int codigoDePecaDois;
        int numeroDePecasdois;
        double valorUnitarioDeCadaPecaDois;
        double valorSerPago;

        // lendo número fornecido pelo usuário, depois  armazenar na variáveis corrrespondente
        codigoDePecaUm = input.nextInt();
        numeroDePecasUm = input.nextInt();
        valorUnitarioDeCadaPecaUm = input.nextDouble();
        codigoDePecaDois = input.nextInt();
        numeroDePecasdois = input.nextInt();
        valorUnitarioDeCadaPecaDois = input.nextDouble();

        // calcular o valor a ser pago
        valorSerPago = (( numeroDePecasUm * valorUnitarioDeCadaPecaUm ) + (numeroDePecasdois * valorUnitarioDeCadaPecaDois));

        System.out.printf("VALOR A PAGAR: R$ %.2f%n" , valorSerPago); // exibe o valor da variável valorSerPago

        // fechar input
        input.close();

    }
}
