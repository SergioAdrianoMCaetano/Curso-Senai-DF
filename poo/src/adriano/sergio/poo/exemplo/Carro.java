package adriano.sergio.poo.exemplo;


import java.util.Scanner;

public class Carro {
    public String modelo;
    public String marca;
    public String cor;
    public double combustivel;
    public boolean ligado;
    public int acelera;

    public Carro() {
    }

    public void estadoCarro() {
        System.out.println();
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Combustível: " + this.combustivel);
        System.out.println("Ligado: " + this.ligado + "\n");
    }

    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.printf("O carro está com %.2f de combustível disponível.", this.combustivel);
        } else if (this.combustivel < 6.0) {
            System.out.println("Reabasteça, o carro está na reserva. \n");
        } else {
            System.out.println("O carro está sem combustível.");
        }

    }

    public void desligar() {
        if (this.ligado) {
            System.out.printf("O carro está desligado e com %.2f de combustível disponível.", this.combustivel);
        }

        if (this.combustivel <= 0.0) {
            System.out.println("Carro sem combustível. Desligar.");
        }

    }

    public void acelerar() {
        if (this.ligado && this.combustivel > 3.0) {
            for (int i = 1; i <= 3; ++i) {

                Scanner entrada = new Scanner(System.in);
                System.out.println("\n Digite a sua velocidade: \n");
                this.acelera = entrada.nextInt();

                if (this.acelera <= 0 || this.acelera <= 220) {
                    System.out.println("Você está à " + this.acelera + "Km/hr\n");

                    if (this.acelera > 0 && this.acelera <= 29) {
                        System.out.println("Você está na primeira marcha.\n");
                        this.combustivel -= 2.5;

                    } else if (this.acelera >= 30 && this.acelera <= 59) {
                        System.out.println("Você está na segunda marcha.\n");
                        this.combustivel -= 3.5;

                    } else if (this.acelera >= 60 && this.acelera <= 89) {
                        System.out.println("Você está na terceira marcha.\n");
                        this.combustivel -= 4.5;

                    } else if (this.acelera >= 90 && this.acelera <= 109) {
                        System.out.println("Você está na quarta marcha.\n");
                        this.combustivel -= 5.5;

                    } else if (this.acelera >= 110 && this.acelera <= 220) {
                        System.out.println("Você está na quinta marcha.\n");
                        this.combustivel -= 6.5;
                        
                    } else {
                        System.out.println("Errou a marcha!\n");
                    }

                    if (this.combustivel < 6.0) {
                        System.out.println("Reabasteça e não fique na mão.");
                    }

                    System.out.printf("O carro está ligado e com %.2f de combustível no tanque.", this.combustivel);
                }
            }
        }

    }

    public void freiar() {
        if (this.ligado && this.acelera > 0) {
            this.acelera -= 30;
            if (this.acelera > 0 && this.acelera <= 29) {
                System.out.println("Você está na primeira marcha.\n");
            } else if (this.acelera >= 30 && this.acelera <= 59) {
                System.out.println("Você está na segunda marcha.\n");
            } else if (this.acelera >= 60 && this.acelera <= 89) {
                System.out.println("Você está na terceira marcha.\n");
            } else if (this.acelera >= 90 && this.acelera <= 109) {
                System.out.println("Você está na quarta marcha.\n");
            } else if (this.acelera >= 110 && this.acelera <= 220) {
                System.out.println("Você está na quinta marcha.\n");
            }

            System.out.println("\n Você desacelerou 30 km.");
            System.out.println("A sua velocidade atual é de " + (this.acelera - 30) + " km/h.");
            System.out.printf("O carro está ligado e com %.2f de combustível no tanque.", this.combustivel);
        }

    }
}


