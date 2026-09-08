package atvDs;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero de 1 a 10: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        sc.close();
    }
}
