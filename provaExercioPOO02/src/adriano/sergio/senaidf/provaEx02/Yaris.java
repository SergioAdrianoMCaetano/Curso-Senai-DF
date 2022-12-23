package adriano.sergio.senaidf.provaEx02;

public class Yaris extends Carro{

    private void automatico(){
        System.out.println("Esse carro é automático");

    }

    @Override
    public void ligar() {
        System.out.println("O YARIS está ligado por meio do botão Start-Stop");
        System.out.println("O carro está ligado");
    }


}
