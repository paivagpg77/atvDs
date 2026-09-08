package atvDs;

public class Ex008 {
    public static void main(String[] args) {
        long anterior = 0;
        long atual = 1;

        System.out.println("Primeiros 20 termos de Fibonacci:");
        for (int i = 1; i <= 20; i++) {
            if (atual % 2 == 0) {
                System.out.println(atual + " (par)");
            } else {
                System.out.println(atual);
            }
            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}
