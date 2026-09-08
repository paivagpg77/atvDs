package atvDs;

public class Ex037 {
    public static void main(String[] args) {
        int n = 12;
        int cliente = 1;

        while (cliente <= n) {
            System.out.print("Atendendo cliente " + cliente);
            if (cliente % 5 == 0) {
                System.out.print(" - Cliente especial! Parabéns por ser o 5º da fila!");
            }
            System.out.println();
            cliente++;
        }
    }
}
