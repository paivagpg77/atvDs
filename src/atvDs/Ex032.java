package atvDs;

import java.util.Scanner;

public class Ex032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite o nu de linha: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int esp = 1; esp <= n - i; esp++) {
                System.out.print(" ");
            }
            for (int aste = 1; aste <= (2 * i - 1); aste++) {
                if (aste >= 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
