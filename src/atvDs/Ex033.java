package atvDs;

public class Ex033 {
    public static void main(String[] args) {
        System.out.println("cel p/ fahr");
        for (int cel = 0; cel <= 100; cel += 10) {
            double fahr = cel * 9.0 / 5.0 + 32;

            if (cel == 0) {
                System.out.println(cel + "°C = " + fahr + "F colgel d/agua");
            } else if (cel == 100) {
                System.out.println(cel + "°C = " + fahr + "F ebu d/agua");
            } else {
                System.out.println(cel + "°C = " + fahr + "F");
            }
        }
    }
}
