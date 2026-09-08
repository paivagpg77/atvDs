package atvDs;

import java.util.Scanner;

public class Ex031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores deseja informar? ");
        int n = sc.nextInt();

        int posi = 0;
        int nega = 0;
        int z = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o valor " + i + ": ");
            double valor = sc.nextDouble();

            if (valor > 0) {
                posi++;
            } else if (valor < 0) {
                nega++;
            } else {
                z++;
            }
        }

        System.out.println("Positivos: " + posi);
        System.out.println("Negativos: " + nega);
        System.out.println("Zeros: " + z);
        sc.close();
    }
}
