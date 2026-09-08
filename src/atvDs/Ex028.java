package atvDs;

import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("valor investido: ");
        double v = sc.nextDouble();
        System.out.print("taxa mensal (ex 0.01): ");
        double taxa = sc.nextDouble();
        System.out.print("limite: ");
        double lim = sc.nextDouble();
        System.out.print("meses: ");
        int meses = sc.nextInt();

        boolean passou = false;

        for (int m = 1; m <= meses; m++) {
            v = v * (1 + taxa);
            System.out.println("mes " + m + ": " + v);

            if (!passou && v > lim) {
                System.out.println("passou do limite no mes " + m);
                passou = true;
            }
        }
        sc.close();
    }
}
