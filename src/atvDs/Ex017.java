package atvDs;

import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        int contador = 0;
        if (n == 0) {
            contador = 1;
        } else {
            n = Math.abs(n);
            while (n > 0) {
                contador++;
                n /= 10;
            }
        }

        System.out.println("Quantidade de dígitos: " + contador);
        sc.close();
    }
}
