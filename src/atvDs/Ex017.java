package atvDs;

import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int n = sc.nextInt();

        int c = 0;
        if (n == 0) {
            c = 1;
        } else {
            n = Math.abs(n);
            while (n > 0) {
                c++;
                n /= 10;
            }
        }

        System.out.println("qtd digitos: " + c);
        sc.close();
    }
}
