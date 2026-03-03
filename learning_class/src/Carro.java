public class Carro {
    int ano;
    String cor;
    String marca;
    String modelo;

    void acelerar() {
        System.out.println("O " + this.modelo + " da marca " + this.marca + " está acelerando...");
        System.out.println("A cor do carro é " + this.cor + " e do ano " + this.ano);
    }
}
