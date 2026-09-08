package atvDs;

public class Ex026 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 13 == 0 && i % 3 == 0) {
                System.out.println("achou: " + i);
                break;
            }
        }
    }
}
