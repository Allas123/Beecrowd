package iniciante.bee1048;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float salarioFuncionario;
        float novoSalario;
        float reajuste;

        salarioFuncionario = input.nextFloat();

        if(salarioFuncionario >= 0.0f & salarioFuncionario <= 400.00f ) {
            reajuste = (salarioFuncionario * 0.15f);
            novoSalario = (reajuste + salarioFuncionario);

            System.out.printf("Novo salario: %.2f%n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",reajuste);
            System.out.printf("Em percentual: 15 %%%n" );
        }

        if(salarioFuncionario > 400.00f & salarioFuncionario <= 800.00f) {
            reajuste = (salarioFuncionario * 0.12f);
            novoSalario = (reajuste + salarioFuncionario);

            System.out.printf("Novo salario: %.2f%n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",reajuste);
            System.out.printf("Em percentual: 12 %%%n" );
        }

        if(salarioFuncionario > 800.00f && salarioFuncionario <= 1200.00f) {
            reajuste = (salarioFuncionario * 0.10f);
            novoSalario = (reajuste + salarioFuncionario);

            System.out.printf("Novo salario: %.2f%n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",reajuste);
            System.out.printf("Em percentual: 10 %%%n" );
        }

        if(salarioFuncionario > 1200.00f && salarioFuncionario <= 2000.00f) {
            reajuste = (salarioFuncionario * 0.07f);
            novoSalario = (reajuste + salarioFuncionario);

            System.out.printf("Novo salario: %.2f%n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",reajuste);
            System.out.printf("Em percentual: 7 %%%n" );
        }

        if(salarioFuncionario > 2000.00f) {
            reajuste = (salarioFuncionario * 0.04f);
            novoSalario = (reajuste + salarioFuncionario);

            System.out.printf("Novo salario: %.2f%n",novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n",reajuste);
            System.out.printf("Em percentual: 4 %%%n" );
        }

        input.close();
    }
}
