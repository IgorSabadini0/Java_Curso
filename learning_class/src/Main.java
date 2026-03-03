public class Main {
    public static void main(String[] var0) {
        Carro var1 = new Carro();
        var1.modelo = "Hilux";
        var1.marca = "Toyota";
        var1.ano = 2025;
        var1.cor = "Branca";
        System.out.println(var1.modelo);
        Casa var2 = new Casa();
        var2.endereco = "Rua dos Alegres, 324, Santa Cruz";
        var2.cor = "Vermelho";
        System.out.println(var2.endereco);
    }
}
