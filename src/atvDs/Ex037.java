package atvDs;

public class Ex037 {
    public static void main(String[] args) {
        int n = 12;
        int cli = 1;

        while (cli <= n) {
            System.out.print("atendendo cliente " + cli);
            if (cli % 5 == 0) {
                System.out.print(" - cliente especial! Parabéns por ser o 5º da fila!");
            }
            System.out.println();
            cli++;
        }
    }
}
