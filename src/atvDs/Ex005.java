package atvDs;

public class Ex005 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 2; i <= 50; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                total++;
            }
        }
        System.out.println("Quantidade de números primos entre 1 e 50: " + total);
    }
}
