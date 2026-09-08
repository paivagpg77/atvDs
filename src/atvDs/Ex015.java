package atvDs;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int n = sc.nextInt();
        int orig = n;
        int inv = 0;

        while (n != 0) {
            int d = n % 10;
            inv = inv * 10 + d;
            n /= 10;
        }

        System.out.println("invertido: " + inv);
        if (orig == inv) {
            System.out.println(orig + " e palindromo");
        } else {
            System.out.println(orig + " nao e palindromo");
        }
        sc.close();
    }
}
