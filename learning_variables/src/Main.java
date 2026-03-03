public class Main {
    public static void main (String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Igor";
        boolean bool = false;

        if (str.isBlank()) {
            System.out.println("A variável se encontra vazia");
        } else {
            System.out.println("A variável recebe o valor " + "'" + str + "'");
        }
    }
}