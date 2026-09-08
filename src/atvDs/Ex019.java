package atvDs;

import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int n = sc.nextInt();

        int inv = 0;
        while (n != 0) {
            int d = n % 10;
            inv = inv * 10 + d;
            n /= 10;
        }

        System.out.println("invertido: " + inv);
        sc.close();
    }
}
