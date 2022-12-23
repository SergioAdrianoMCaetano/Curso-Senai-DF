package adriano.sergio.senaidf.provaEx02;

public class Principal {

    public static void main(String[] args) {
        Gol gol = new Gol();
        Scort scort = new Scort();
        Allure allure = new Allure();
        Yaris yaris = new Yaris();


        gol.ligar();
        scort.ligar();
        allure.ligar();
        yaris.ligar();
    }
}
