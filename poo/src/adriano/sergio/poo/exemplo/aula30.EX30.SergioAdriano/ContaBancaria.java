package adriano.sergio.poo.exemplo.aula30;

/*Crie uma classe de Conta e instancie essa classe Conta a 3 objetos de contas diferentes.
No seu exercício deve conter todos os métodos explicados na aula: Assessor(GET),
modificador(SET) e construtor(NomeDaClasse). Use a criatividade para criar os métodos e atributos,
faça uma abstração do que sua conta no banco vai precisar ter e como ela vai funcionar.*/

public class ContaBancaria {


    //Atributos da conta
    // Podem haver 3 tipos de visibilidade dos atributos: publicos, privados e protegidos
    //public - Qualquer um tem acesso
    //private - Apenas a classe tem acesso
    // protected - Apenas a mae e seus filhos tem acesso
    private String titular;
    private String numeroConta;
    private double limite;
    private double saldo;
    private boolean status;


    //Métodos publicos
    public void sacar(double saque) {
        if (!this.status) {
            System.out.println("Nao foi possivel realizar o saque! Verifique o Status da conta!");
        } else if (saque > this.saldo) {
            System.out.println("Saldo insuficiente para saque!");
        } else {
            this.saldo -= saque;

        }
    }

    public void depositar(double deposito) {
        if (this.status) {
            this.saldo += deposito;
        } else {
            System.out.println("Nao foi possivel realizar o deposito! Verifique o Status da conta!");
        }
    }

    public void extrato() {
        System.out.println("\nTitular: " + this.titular);
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("saldo: " + this.saldo);
        System.out.println("limite: " + this.limite);
        System.out.println("Status: " + this.status + "\n");
    }

    public void ativarConta() {
        this.status = true;
    }



    // -------------------------------------------------------------------------------------------------------------------------------

    // Metodos especiais
    // Este é o metodo construtor. Ele sera chamado no momento que for instanciado um objeto da classe
    // Ele ira executar o que for mandado. No exemplo o usuario vai colcoar seu nome, e numero da conta no momento
    // que essa conta for criado e ao mesmo tempo ela ja ira começar com o saldo 0, limite 0 e status false.
    // OBS: O metodo construtor tem o mesmo nome da Classe.
    public ContaBancaria(String nome, String numeroConta) {
        setTitular(nome);
        setNumeroConta(numeroConta);
        setSaldo(0);
        setLimite(0);
        setStatus(false);
    }



    // -------------------------------------------------------------------------------------------------------------------------------



    // Metoods geters e setters sao metodos criados para que não se possa ter acesso direto aos atributos
    // GET - Pega algum valor, exibe esse valor
    //SET - Envia um novo valor
    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String nome) {
        this.titular = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
