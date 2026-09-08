package atvDs;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("\nDigite as 3 notas do aluno " + i + ": ");
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();
            double media = (n1 + n2 + n3) / 3;

            System.out.print("Média: " + media + " - ");
            if (media >= 7) {
                System.out.println("Aprovado");
            } else if (media >= 5) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }
        sc.close();
    }
}
