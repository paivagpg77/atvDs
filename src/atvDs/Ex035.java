package atvDs;

import java.util.Scanner;

public class Ex035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o 1: ");
        int a = sc.nextInt();
        System.out.print("digite o 2 : ");
        int b = sc.nextInt();

        int x = a;
        int y = b;
        while (y != 0) {
            int resto = x % y;
            x = y;
            y = resto;
        }
        int mdc = x;

        int mmc = (a * b) / mdc;
        if (mmc < 0) {
            mmc = -mmc;
        }
        System.out.println("MMC entre " + a + " e " + b + " é: " + mmc);
        sc.close();
    }
}
