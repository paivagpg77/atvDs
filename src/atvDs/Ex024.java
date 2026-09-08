package atvDs;

import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= 10) {
            int resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
            if (resultado % 7 == 0) {
                System.out.println("Primeiro múltiplo de 7 encontrado! Interrompendo.");
                break;
            }
            i++;
        }
        sc.close();
    }
}
