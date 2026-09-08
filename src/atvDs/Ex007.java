package atvDs;

public class Ex007 {
    public static void main(String[] args) {
        System.out.println("Números perfeitos entre 1 e 500:");
        for (int i = 1; i <= 500; i++) {
            int soma = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    soma += j;
                }
            }
            if (soma == i && i != 0) {
                System.out.println(i);
            }
        }
    }
}
