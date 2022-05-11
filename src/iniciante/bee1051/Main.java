package iniciante.bee1051;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float salario;
        float impostoRenda;

        salario = input.nextFloat();

        if (salario >= 0.00f && salario <= 2000.00f) {
            System.out.printf("Isento%n");

        } else if (salario > 2000.00f && salario <= 3000.00f) {
            impostoRenda = (salario - 2000) * 0.08f;

            System.out.printf("R$ %.2f%n", impostoRenda);

        } else if (salario > 3000.00f && salario <= 4500.00f) {
            impostoRenda = 1000 * 0.08f;
            impostoRenda += (salario - 3000) * 0.18f;

            System.out.printf("R$ %.2f%n", impostoRenda);

        } else {
            impostoRenda = 1000 * 0.08f;
            impostoRenda += 1500 * 0.18f;
            impostoRenda += (salario - 4500) * 0.28f;

            System.out.printf("R$ %.2f%n", impostoRenda);
        }

        input.close();
    }
}
