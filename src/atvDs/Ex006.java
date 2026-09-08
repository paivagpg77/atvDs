package atvDs;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("erro: numero negativo.");
        } else {
            long f = 1;
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            System.out.println("fatorial: " + f);
        }
        sc.close();
    }
}
