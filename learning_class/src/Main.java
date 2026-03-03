public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.modelo = "Hilux";
        meuCarro.marca = "Toyota";
        meuCarro.ano = 2025;
        meuCarro.cor = "Branca";

        System.out.println(meuCarro.modelo);

        Casa minhaCasa = new Casa();

        minhaCasa.endereco = "Rua dos Alegres, 324, Santa Cruz";
        minhaCasa.cor = "Vermelho";

        System.out.println(minhaCasa.endereco);
    }
}