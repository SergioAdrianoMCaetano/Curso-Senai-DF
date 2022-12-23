package adriano.sergio.poo.exemplo.aula30;

public class PrincipalContaBancaria03 {

    public static void main(String[] args) {

        ContaBancaria conta2 = new ContaBancaria("Luiz", "013");

        System.out.println(true);

        conta2.ativarConta();
        conta2.depositar(1300);
        conta2.sacar(22);
        conta2.extrato();
    }
}
