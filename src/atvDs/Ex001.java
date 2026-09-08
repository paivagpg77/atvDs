package atvDs;
import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - Par");
            } else {
                System.out.println(i + " - Ímpar");
            }
        }

        sc.close();
    }
}