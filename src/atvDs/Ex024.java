package atvDs;

import java.util.Scanner;

public class Ex024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= 10) {
            int r = n * i;
            System.out.println(n + " x " + i + " = " + r);
            if (r % 7 == 0) {
                System.out.println("achou multiplo de 7, parando");
                break;
            }
            i++;
        }
        sc.close();
    }
}
