package atvDs;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - par");
            } else {
                System.out.println(i + " - impar");
            }
        }
        sc.close();
    }
}
