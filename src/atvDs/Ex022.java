package atvDs;

import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int maiusculas = 0;
        int minusculas = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isUpperCase(c)) {
                maiusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            }
        }

        System.out.println("Letras maiúsculas: " + maiusculas);
        System.out.println("Letras minúsculas: " + minusculas);
        sc.close();
    }
}
