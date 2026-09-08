package atvDs;

import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite uma frase: ");
        String f = sc.nextLine();

        int mai = 0;
        int min = 0;

        for (int i = 0; i < f.length(); i++) {
            char c = f.charAt(i);
            if (Character.isUpperCase(c)) {
                mai++;
            } else if (Character.isLowerCase(c)) {
                min++;
            }
        }

        System.out.println("maiusculas: " + mai);
        System.out.println("minusculas: " + min);
        sc.close();
    }
}
