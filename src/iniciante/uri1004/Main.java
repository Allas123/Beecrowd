package iniciante.uri1004;

import java.util.Scanner; // programa utiliza a classe Scanner

public class Main {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int primeiroNumero; // primeiro número a ser multiplicado
        int segundoNumero; // segundo número a ser multiplicado
        int prod; // cálculo da multiplicação

        primeiroNumero = input.nextInt(); // lê primeiro número fornecindo pelo usuário e armazenando na variável primeiroNumero
        segundoNumero = input.nextInt(); // lê segundo número fornecindo pelo usuário e armazenando na variável segundoNumero

        // fazendo a multiplicação da variáveis, primeroNumero e segundoNumero, depois armazenar na variavel prod
        prod = primeiroNumero * segundoNumero;

        System.out.printf("PROD = %d%n", prod); // exiber o valor da variável prod

        // fechar input
        input.close();

    }
}
