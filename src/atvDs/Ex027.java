package atvDs;

import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = 42;
        int chute;

        do {
            System.out.print("chute: ");
            chute = sc.nextInt();

            if (chute > sec) {
                System.out.println("menor que isso");
            } else if (chute < sec) {
                System.out.println("maior que isso");
            } else {
                System.out.println("acertou!");
            }
        } while (chute != sec);

        sc.close();
    }
}
