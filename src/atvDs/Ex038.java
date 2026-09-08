package atvDs;

import java.util.Scanner;

public class Ex038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        double base = sc.nextDouble();
        System.out.print("Digite o expoente (inteiro >= 0): ");
        int expoente = sc.nextInt();

        double resultado;

        if (expoente == 0) {
            resultado = 1;
        } else {
            resultado = 1;
            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }
        }

        System.out.println(base + " elevado a " + expoente + " = " + resultado);
        sc.close();
    }
}
