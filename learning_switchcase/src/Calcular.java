public class Calcular {
    public double calculos(double n1, double n2, int op) {
        switch (op) {
            case 1:
                return n1 + n2;
            case 2:
                return n1 - n2;
            case 3:
                return n1 * n2;
            case 4:
                if (n2 != 0) {
                    return n1 / n2;
                } else {
                    System.out.println("Divisão por ZERO");
                    return -1;
                }
            default:
                System.out.println("Operação Inválida");
                return -1;
        }
    }
}
