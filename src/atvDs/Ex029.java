package atvDs;

public class Ex029 {
    public static void main(String[] args) {
        for (int a = 2000; a <= 2030; a++) {
            if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
                System.out.println(a + " e bissexto");
            }
        }
    }
}
