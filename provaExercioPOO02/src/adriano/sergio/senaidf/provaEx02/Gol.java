package adriano.sergio.senaidf.provaEx02;

public class Gol extends Carro{

    private boolean turbo;

    @Override
    public void ligar() {
        System.out.println("O GOL liga com a chave e está ligado");
    }


    //MÉTODOS ESPECIAIS
    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
}
