package atvDs;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos? ");
        int n = sc.nextInt();

        int aprovados = 0;
        int reprovados = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a média do aluno " + i + ": ");
            double media = sc.nextDouble();

            if (media >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        System.out.println("Total de aprovados: " + aprovados);
        System.out.println("Total de reprovados: " + reprovados);
        sc.close();
    }
}
