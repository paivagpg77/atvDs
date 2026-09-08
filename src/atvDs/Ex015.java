package atvDs;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();
        int original = n;
        int invertido = 0;

        while (n != 0) {
            int digito = n % 10;
            invertido = invertido * 10 + digito;
            n /= 10;
        }

        System.out.println("Número invertido: " + invertido);
        if (original == invertido) {
            System.out.println(original + " é um palíndromo.");
        } else {
            System.out.println(original + " não é um palíndromo.");
        }
        sc.close();
    }
}
