package iniciante.uri1013;

import java.util.Scanner;

public class Main {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int a; // primeiro número para comparar se é maior
        int b; // segundo  número para comparar se é maior
        int c; // terceiro número para comparar se é maior
        int maiorAB; // calcula o maior entre  a e b
        int maiorBC; //  calcula o maior entre b e c

        // lendo números fornecido pelo usuário, depois  armazenar na variáveis corrrespondente
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        // Utilizando a fórmula para saber qual número maior, entre as variável a e b
        maiorAB = (a + b + Math.abs(a - b)) / 2;

        // Utilizando a fórmula para saber qual número maior, entre as variável maiorAB e c
        maiorBC = ((maiorAB + c + Math.abs(maiorAB - c)) /2);

        System.out.printf("%d eh o maior%n" , maiorBC);  // exibe o valor da variável maiorBC

        // fechar input
        input.close();

    }
}
