package adriano.sergio.senaidf.provaEx02;

public abstract class Carro {

    /*02) A respeito de programação POO, faça uma aplicação em que havera um classe Carro que tera
    as caracteristicas: ano, marca, modelo, cor, placa e se ele esta ligado ou nao.
    Como comportamento cada carro poderá ser ligado, porem existem carros que podem ser ligados de maneira de diferente,
    alguns girando a chave e outros apertando um botão. Crie 4 carros sendo 2 deles ligando pela chave e
    2 apertando o botao. Veja na internet quais são os modelo que ligam atraves do botao.
    Dica: Utilize o conceito de polimorfismo para facilitar a implementação. Compacte seu código e insira-o aqui.*/

    //ATRIBUTOS
    private int ano;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private boolean ligado;

    //CONSTRUTOR SIMPLES
    public Carro(){
        super();
    }

    //CONSTRUTOR COMPLETO
    public Carro(int ano, String marca, String modelo, String cor, String placa) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.ligado = ligado;
    }



    //MÉTODO
    public abstract void ligar();



    //MÉTODOS ESPECIAIS
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
