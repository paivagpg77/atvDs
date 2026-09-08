package atvDs;
import java.util.Scanner;

public class Ex036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cres = true;
        boolean pri = true;
        int ant = 0;

        System.out.println("Digite números inteiros (digite -1 para parar):");
        while (true) {
            int numero = sc.nextInt();
            if (numero == -1) {
                break;
            }

            if (!pri && numero <= ant) {
                cres = false;
            }

            ant = numero;
            pri = false;
        }

        if (cres) {
            System.out.println("A sequência informada foi crescente.");
        } else {
            System.out.println("A sequência informada não foi crescente.");
        }
        sc.close();
    }
}
