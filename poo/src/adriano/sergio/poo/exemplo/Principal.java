package adriano.sergio.poo.exemplo;


public class Principal {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Hyundai";
        carro.modelo = "HB20";
        carro.cor = "Cinza-Sand";
        carro.combustivel = 20.0;
        carro.ligado = false;
        carro.acelera = 80;
        carro.estadoCarro();
        System.out.println("Ligar veículo");
        carro.ligar();
        System.out.println();
        System.out.println();
        System.out.println("Acelerar veículo");
        carro.acelerar();
        carro.freiar();
    }
}
