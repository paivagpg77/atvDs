package atvDs;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite n: ");
        int n = sc.nextInt();

        while (n >= 1) {
            System.out.println(n);
            n--;
        }
        System.out.println("decolagem!");
        sc.close();
    }
}
