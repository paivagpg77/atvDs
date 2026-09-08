package atvDs;

public class Ex005 {
    public static void main(String[] args) {
        int t = 0;
        for (int i = 2; i <= 50; i++) {
            boolean p = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    p = false;
                    break;
                }
            }
            if (p) {
                t++;
            }
        }
        System.out.println("qtd primos: " + t);
    }
}
