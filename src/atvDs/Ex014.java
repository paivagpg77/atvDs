package atvDs;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("quantos aluno? ");
        int n = sc.nextInt();

        int apro = 0;
        int repr = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("media do aluno " + i + ": ");
            double media = sc.nextDouble();

            if (media >= 7) {
                apro++;
            } else {
                repr++;
            }
        }

        System.out.println("aprovados: " + apro);
        System.out.println("reprovados: " + repr);
        sc.close();
    }
}
