package adriano.sergio.senaidf.provaEx02;

public class Scort extends Carro{

    private boolean capota;

    @Override
    public void ligar() {
        System.out.println("O SCORT está ligado por meio da chave");
    }

    //MÉTODOS ESPECIAIS
    public boolean isCapota() {
        return capota;
    }

    public void setCapota(boolean capota) {
        this.capota = capota;
    }
}
