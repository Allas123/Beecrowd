package iniciante.uri1002;

import java.util.Scanner; // programa utiliza a classe Scanner

public class Main {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        double raio; // número inserido pelo usuário, para fazer o cálculo da área
        double area; // cálculo da area

        raio = input.nextDouble(); // lê número fornecido pelo usuário, depois  armazenar na variável raio

        area = Math.pow(raio, 2) * 3.14159; // fazer o cálculo da área, depois  armazenar na variável area

        System.out.printf("A=%.4f%n", area); // exibe o valor da variável area

        // fechar input
        input.close();
    }
}
