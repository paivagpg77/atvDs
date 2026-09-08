package atvDs;

import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite uma palavra: ");
        String p = sc.nextLine();

        boolean pal = true;
        int ini = 0;
        int fim = p.length() - 1;

        for (int i = 0; i < p.length() / 2; i++) {
            if (p.charAt(ini) != p.charAt(fim)) {
                pal = false;
                break;
            }
            ini++;
            fim--;
        }

        if (pal) {
            System.out.println(p + " e palindroma");
        } else {
            System.out.println(p + " nao e palindroma");
        }
        sc.close();
    }
}
