package iniciante.uri1008;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroFuncionrio;
        int numeroHorasTrabalhadas;
        double valorRecebePorHora;

        double salario;

        numeroFuncionrio = input.nextInt();
        numeroHorasTrabalhadas = input.nextInt();
        valorRecebePorHora = input.nextDouble();

        salario = (numeroHorasTrabalhadas * valorRecebePorHora);

        System.out.printf("NUMBER = %d%n", numeroFuncionrio);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        input.close();
    }
}
