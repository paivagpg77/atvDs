package atvDs;

import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor investido: ");
        double valor = sc.nextDouble();
        System.out.print("Digite a taxa mensal (ex: 0.01 para 1%%): ");
        double taxa = sc.nextDouble();
        System.out.print("Digite o limite a ultrapassar: ");
        double limite = sc.nextDouble();
        System.out.print("Digite o número de meses a simular: ");
        int meses = sc.nextInt();

        boolean ultrapassou = false;

        for (int mes = 1; mes <= meses; mes++) {
            valor = valor * (1 + taxa);
            System.out.println("Mês " + mes + ": R$ " + valor);

            if (!ultrapassou && valor > limite) {
                System.out.println(">>> O valor ultrapassou o limite no mês " + mes + "!");
                ultrapassou = true;
            }
        }
        sc.close();
    }
}
