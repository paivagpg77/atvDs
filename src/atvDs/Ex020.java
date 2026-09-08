package atvDs;

import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite n: ");
        long n = sc.nextLong();

        int p = 0;
        System.out.print("seq: " + n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            System.out.print(" -> " + n);
            p++;
        }

        System.out.println();
        System.out.println("passos: " + p);
        sc.close();
    }
}
