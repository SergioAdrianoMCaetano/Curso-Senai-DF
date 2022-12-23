package adriano.sergio.poo.exemplo.aula03encapsulamento;

public class CaixaSom implements Controlador {

    private int volume;
    private int volumeMaximo = 100;
    private boolean ligada;
    private boolean tocando;

    // MÉTODO CONSTRUTOR
    public CaixaSom() {

        this.setVolume(30);
        this.setLigada(false);
        this.setTocando(false);

    }


    // ----------------------------------


    // MÉTODOS ESPECIAIS
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigada() {
        return ligada;
    }

    private void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    // ----------------------------------

    //MÉTODOS PÚBLICOS - IMPLEMENTADOS POR MEIO DA INTERFACE
    @Override
    public void ligar() {
        this.setLigada(true);
        System.out.println("Aparelho ligado \n");

    }

    @Override
    public void desligar() {

    }

    @Override
    public void aumentarVolume() {

        if (this.isLigada()) {
            if (this.getVolume() <= this.volumeMaximo){
                this.volume += 5;

            }else {
            System.out.println("Volume máximo");
            }

        } else {
            System.out.println("----------");

            System.out.println("----------");
        }
    }

    @Override
    public void diminuirVolume() {
        if (this.isLigada()) {
            this.volume -= 5;
        } else {
            System.out.println("----------");
            System.out.println("----------");
            System.out.println("----------");
        }
    }

    @Override
    public void abrirMenu() {
        if (this.isLigada()) {
            System.out.println("Volume: " + this.getVolume());
            for (int c = 1; c < this.getVolume(); c += 5) {
            }
            System.out.println("Tocando: " + (this.isTocando() ?
                    "Tocando" : "Mudo.")); //operador ternário - If & Else em uma linha
            // Se a condição for verdadeira executa, se não
        } else {
            System.out.println("----------");
            System.out.println("----------");
            System.out.println("----------");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigada()) {
            System.out.println("Fechando menu.");
        } else {
            System.out.println("----------");
            System.out.println("----------");
            System.out.println("----------");
        }

    }

    @Override
    public void ligarMudo() {
        if (this.isLigada()) {
            this.setVolume(0);
            this.setTocando(false);
        } else {
            System.out.println("----------");
            System.out.println("----------");
            System.out.println("----------");
        }
    }


    @Override
    public void desligarMudo() {

        if (this.isLigada()) {
            this.setVolume(30);
            this.setTocando(true);
        } else {
            System.out.println("----------");
            System.out.println("----------");
            System.out.println("----------");
            ;
        }
    }

    @Override
    public void play() {
        if (this.isLigada()) {
            this.setTocando(true);
        } else {
        }
    }

    @Override
    public void pause() {
        if (this.isLigada()) {
            this.setTocando(false);
        } else {
            System.out.println("----------");
            System.out.println("----------");
            System.out.println("----------");
        }
    }

    @Override
    public void avancarMusica() {
        if (this.isLigada()) {
            this.setTocando(false);
        } else {
            System.out.println("----------");
            System.out.println("----------");
            System.out.println("----------");
        }
    }

    @Override
    public void voltarMusica() {
        if (this.isLigada()) {
            this.setTocando(false);
        } else {
            System.out.println("----------");
            System.out.println("----------");
            System.out.println("----------");
        }
    }
}
