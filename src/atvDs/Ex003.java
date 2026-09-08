package atvDs;

public class Ex003 {
    public static void main(String[] args) {
        int i = 1;
        int s = 0;
        while (i <= 100) {
            if (i % 2 != 0) {
                s += i;
            }
            i++;
        }
        System.out.println("soma impares: " + s);
    }
}
