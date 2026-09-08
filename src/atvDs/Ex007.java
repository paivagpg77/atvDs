package atvDs;

public class Ex007 {
    public static void main(String[] args) {
        System.out.println("numeros perfeitos ate 500:");
        for (int i = 1; i <= 500; i++) {
            int s = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    s += j;
                }
            }
            if (s == i && i != 0) {
                System.out.println(i);
            }
        }
    }
}
