package atvDs;

import java.util.Scanner;

public class Ex031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores deseja informar? ");
        int n = sc.nextInt();

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o valor " + i + ": ");
            double valor = sc.nextDouble();

            if (valor > 0) {
                positivos++;
            } else if (valor < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
        sc.close();
    }
}
