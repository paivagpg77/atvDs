package atvDs;

import java.util.Scanner;

public class Ex040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "1234";
        int tentativas = 0;
        boolean acesso = false;

        do {
            System.out.print("Digite a senha: ");
            String senha = sc.next();
            tentativas++;

            if (senha.equals(senhaCorreta)) {
                acesso = true;
                System.out.println("Acesso liberado!");
            } else {
                int restantes = 3 - tentativas;
                if (restantes > 0) {
                    System.out.println("Senha incorreta! Tentativas restantes: " + restantes);
                } else {
                    System.out.println("Acesso bloqueado! Número máximo de tentativas excedido.");
                }
            }
        } while (!acesso && tentativas < 3);

        sc.close();
    }
}
