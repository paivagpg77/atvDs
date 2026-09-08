package atvDs;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.0;
        int op;

        do {
            System.out.println("saldo: " + saldo);
            System.out.println("1 - sacar");
            System.out.println("2 - sair");
            System.out.print("opcao: ");
            op = sc.nextInt();

            if (op == 1) {
                System.out.print("valor do saque: ");
                double v = sc.nextDouble();
                if (v > saldo) {
                    System.out.println("saldo insuficiente!");
                } else {
                    saldo -= v;
                    System.out.println("saque feito.");
                }
            }
        } while (op != 2);

        System.out.println("saldo final: " + saldo);
        sc.close();
    }
}
