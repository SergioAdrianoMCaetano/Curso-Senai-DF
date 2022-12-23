package adriano.sergio.poo.exemplo.aula30;


public class PrincipalContaBancaria02 {
    public static void main(String[] args) {

        ContaBancaria conta2 = new ContaBancaria("Sérgio", "133");

        System.out.println(true);

        conta2.ativarConta();
        conta2.depositar(1000);
        conta2.sacar(150);
        conta2.extrato();

    }

}
