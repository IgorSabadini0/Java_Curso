//        17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//        Fórmula: C = (5 * (F-32) / 9)

public class Main {
    public static void main(String[] args) {
        System.out.println(fahrenheitToCelsius(20));
    }

    public static String fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5 * (fahrenheit - 32)) / 9;
        return String.format("Celsius: %.2f°C, Fahrenheit: %.2f°F", celsius, fahrenheit); /*Formatação 2 casas decimais, quando usado %.2f e depois da vírgula informa a variável que será formatada respectivamente*/
    }
}