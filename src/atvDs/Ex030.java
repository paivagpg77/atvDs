package atvDs;

import java.util.Scanner;

public class Ex030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("1-soma 2-sub 3-mult 4-div 5-sair");
            System.out.print("opcao: ");
            op = sc.nextInt();

            if (op >= 1 && op <= 4) {
                System.out.print("num 1: ");
                double a = sc.nextDouble();
                System.out.print("num 2: ");
                double b = sc.nextDouble();

                switch (op) {
                    case 1:
                        System.out.println("res: " + (a + b));
                        break;
                    case 2:
                        System.out.println("res: " + (a - b));
                        break;
                    case 3:
                        System.out.println("res: " + (a * b));
                        break;
                    case 4:
                        if (b == 0) {
                            System.out.println("erro: divisao por zero");
                        } else {
                            System.out.println("res: " + (a / b));
                        }
                        break;
                }
            } else if (op != 5) {
                System.out.println("opcao invalida");
            }
        } while (op != 5);

        System.out.println("saindo...");
        sc.close();
    }
}
