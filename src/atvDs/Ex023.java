package atvDs;

import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        boolean palindroma = true;
        int inicio = 0;
        int fim = palavra.length() - 1;

        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                palindroma = false;
                break;
            }
            inicio++;
            fim--;
        }

        if (palindroma) {
            System.out.println("\"" + palavra + "\" é palíndroma.");
        } else {
            System.out.println("\"" + palavra + "\" não é palíndroma.");
        }
        sc.close();
    }
}
