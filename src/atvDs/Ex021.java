package atvDs;

import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite uma frase: ");
        String f = sc.nextLine();

        int v = 0;
        for (int i = 0; i < f.length(); i++) {
            char c = Character.toLowerCase(f.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                v++;
            }
        }

        System.out.println("qtd vogais: " + v);
        sc.close();
    }
}
