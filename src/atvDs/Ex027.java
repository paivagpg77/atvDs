package atvDs;

import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = 42;
        int chute;

        do {
            System.out.print("Digite um chute: ");
            chute = sc.nextInt();

            if (chute > secreto) {
                System.out.println("O número secreto é menor que o seu chute.");
            } else if (chute < secreto) {
                System.out.println("O número secreto é maior que o seu chute.");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto!");
            }
        } while (chute != secreto);

        sc.close();
    }
}
