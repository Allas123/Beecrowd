package iniciante.uri1008;

import java.util.Scanner;

public class Main {

    // método main inicia a execução do aplicativo Java
    public static void main(String[] args) {

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int numeroFuncionrio;
        int numeroHorasTrabalhadas;
        double valorRecebePorHora;
        /*
        calcular o salário do funcionário com base nas horas
        trabalhadas multiplicado, o valor que recebe por hora
        */
        double salario;

        numeroFuncionrio = input.nextInt();
        numeroHorasTrabalhadas = input.nextInt();
        valorRecebePorHora = input.nextDouble();

        // fazendo o cálculo do salário do funcionario
        salario = (numeroHorasTrabalhadas * valorRecebePorHora);

        System.out.printf("NUMBER = %d%n", numeroFuncionrio); // exibe o valor da variável numeroFuncionrio
        System.out.printf("SALARY = U$ %.2f%n", salario); // exibe o valor da variável salario

        // fechar input
        input.close();
    }
}
