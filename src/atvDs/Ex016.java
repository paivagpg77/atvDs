package atvDs;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int n = sc.nextInt();

        int qtd = String.valueOf(n).length();
        int s = 0;
        int t = n;

        for (int i = 0; i < qtd; i++) {
            int d = t % 10;
            s += Math.pow(d, qtd);
            t /= 10;
        }

        if (s == n) {
            System.out.println(n + " e armstrong");
        } else {
            System.out.println(n + " nao e armstrong");
        }
        sc.close();
    }
}
