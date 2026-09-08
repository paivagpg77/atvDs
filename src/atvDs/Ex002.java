package atvDs;

public class Ex002 {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                s += i;
            }
        }
        System.out.println("soma pares: " + s);
    }
}
