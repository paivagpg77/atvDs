package atvDs;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.0;
        int opcao;

        do {
            System.out.println("\ncaixa");
            System.out.println("Saldo atual: R$ " + saldo);
            System.out.println("1 - Sacar");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor do saque: ");
                double valor = sc.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("Saque realizado com sucesso!");
                }
            }
        } while (opcao != 2);

        System.out.println("Saldo final: R$ " + saldo);
        sc.close();
    }
}
