package iniciante.uri1007;

import java.util.Scanner; // programa utiliza a classe Scanner

public class Main {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        int diferenca; // resultado da diferençia do produto a e b pelo produto de c e d


        // lendo número fornecido pelo usuário, depois  armazenar na variáveis corrrespondente
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();


        diferenca = (a * b - c * d); // fazendo o cálculo da diferença dos produtos

        System.out.printf("DIFERENCA = %d%n", diferenca); // exibe o valor da variável diferenca

        // fechar input
        input.close();

    }
}
