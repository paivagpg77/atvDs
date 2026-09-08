package atvDs;

import java.util.Scanner;

public class Ex034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        int x = a;
        int y = b;

        while (y != 0) {
            int resto = x % y;
            x = y;
            y = resto;
        }

        System.out.println("MDC entre " + a + " e " + b + " é: " + x);
        sc.close();
    }
}
