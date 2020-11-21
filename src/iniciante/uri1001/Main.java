package iniciante.uri1001;

import java.util.Scanner; // programa utiliza a classe Scanner

public class Main {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int a; // primeiro número a somar
        int b; // segundo número a somar
        int x; // soma das variáveis de a e b

        a = input.nextInt(); // lê o primeiro número fornecido pelo usuário, armazenando na variável a
        b = input.nextInt(); // lê o segundo número fornecido pelo usuário, armazenando na variável b

        x = a + b; // somar os números nas variáveis de a e b , depois armazena o total na variavel x

        System.out.printf("X = %d%n", x); // exibe o valor da variável x

        // fechar input
        input.close();

    }
}
