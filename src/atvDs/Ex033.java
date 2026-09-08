package atvDs;

public class Ex033 {
    public static void main(String[] args) {
        System.out.println("Tabela de conversão Celsius -> Fahrenheit");
        for (int celsius = 0; celsius <= 100; celsius += 10) {
            double fahrenheit = celsius * 9.0 / 5.0 + 32;

            if (celsius == 0) {
                System.out.println(celsius + "°C = " + fahrenheit + "°F (Congelamento da água)");
            } else if (celsius == 100) {
                System.out.println(celsius + "°C = " + fahrenheit + "°F (Ebulição da água)");
            } else {
                System.out.println(celsius + "°C = " + fahrenheit + "°F");
            }
        }
    }
}
