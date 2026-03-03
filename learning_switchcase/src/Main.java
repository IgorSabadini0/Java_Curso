public class Main {
    public static void main (String[] args) {
        System.out.println("=============================");
        System.out.println("[1] - Soma");
        System.out.println("[2] - Subtração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");
        System.out.println("=============================");
        Calcular meuCalculo = new Calcular();


        System.out.println("Resultado = " + meuCalculo.calculos(12, 0, 4));
    }
}