package atvDs;

import java.util.Scanner;

public class Ex032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int espaco = 1; espaco <= n - i; espaco++) {
                System.out.print(" ");
            }
            for (int asterisco = 1; asterisco <= (2 * i - 1); asterisco++) {
                if (asterisco >= 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
