package iniciante.uri1005;

import java.util.Scanner; // programa utiliza a classe Scanner


public class Main {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        double a; // primeira nota a fazer a média
        double b; // segundo nota a fazer a média
        double media; // cálculo da média

        a = input.nextDouble(); // lê primeira nota fornecindo pelo usuário e armazenando na variável a
        b = input.nextDouble(); // lê segunda nota fornecindo pelo usuário e armazenando na variável b

        a *= 3.5; // atribuído peso da primeira nota
        b *= 7.5; // atribuído peso da segunda nota

        media = ((a + b) / 11); // fazer cálculo da média, depois  armazenar na variável media

        System.out.printf("MEDIA = %.5f%n", media); // exiber o valor da variável media

        // fechar input
        input.close();
    }
}
