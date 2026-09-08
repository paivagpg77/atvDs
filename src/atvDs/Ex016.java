package atvDs;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int quantidadeDigitos = String.valueOf(n).length();
        int soma = 0;
        int temp = n;

        for (int i = 0; i < quantidadeDigitos; i++) {
            int digito = temp % 10;
            soma += Math.pow(digito, quantidadeDigitos);
            temp /= 10;
        }

        if (soma == n) {
            System.out.println(n + " é um número de Armstrong.");
        } else {
            System.out.println(n + " não é um número de Armstrong.");
        }
        sc.close();
    }
}
