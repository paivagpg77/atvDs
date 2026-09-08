package atvDs;

public class Ex008 {
    public static void main(String[] args) {
        long ant = 0;
        long atu = 1;

        System.out.println("fibonacci:");
        for (int i = 1; i <= 20; i++) {
            if (atu % 2 == 0) {
                System.out.println(atu + " (par)");
            } else {
                System.out.println(atu);
            }
            long prox = ant + atu;
            ant = atu;
            atu = prox;
        }
    }
}
