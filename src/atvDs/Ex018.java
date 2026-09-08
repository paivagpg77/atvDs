package atvDs;

import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int n = sc.nextInt();

        int s = 0;
        n = Math.abs(n);
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }

        System.out.println("soma digitos: " + s);
        sc.close();
    }
}
