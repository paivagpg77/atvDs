package atvDs;

import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número N: ");
        long n = sc.nextLong();

        int passos = 0;
        System.out.print("Sequência: " + n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            System.out.print(" -> " + n);
            passos++;
        }

        System.out.println("\nNúmero de passos: " + passos);
        sc.close();
    }
}
