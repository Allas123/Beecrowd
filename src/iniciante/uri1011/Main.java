package iniciante.uri1011;

import java.util.Scanner;

public class Main {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // criando as variáveis correspondente a sua utilização
        double raio;
        double pi = 3.14159;
        double volume;

        raio = input.nextDouble(); // lê o raio da esfera fornecinda pelo usuário, depois armazenar na variável raio

        volume = (4.0 / 3.0) * pi * Math.pow(raio, 3); // calcular  o volume da esfera

        System.out.printf("VOLUME = %.3f%n", volume); // exibe o valor da variável volume

        // fechar input
        input.close();
    }
}

