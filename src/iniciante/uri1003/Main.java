package iniciante.uri1003;

import java.util.Scanner; // programa utiliza a classe Scanner

public class Main {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int a; // primeiro número a somar
        int b; // segundo número a somar
        int soma; // cálculo da soma

        a = input.nextInt(); // lê primeiro  número fornecido pelo usuário, armazenando na variável a
        b = input.nextInt(); // lê segundo número fornecido pelo usuário, armazenando na variável a

        soma = a + b; // soma os números nas variáveis de a e b, depois armazenar na variavel soma

        System.out.printf("SOMA = %d%n", soma); // exibe a valor da variável soma

        // fechar input
        input.close();

    }
}
