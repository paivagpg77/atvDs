package atvDs;

import java.util.Scanner;

public class Ex039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o limite N: ");
        int limite = sc.nextInt();

        System.out.println("Números triangulares até " + limite + ":");
        int soma = 0;
        for (int i = 1; soma <= limite; i++) {
            soma += i;
            if (soma <= limite) {
                System.out.println(soma);
            }
        }
        sc.close();
    }
}
