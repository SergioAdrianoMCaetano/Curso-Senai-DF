package adriano.sergio.poo.exemplo.aula30;

import javax.management.ObjectInstance;

public class PrincipalContaBancaria {


    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Miguel", "333");

        System.out.println(conta1 instanceof ContaBancaria);


        conta1.ativarConta();
        conta1.depositar(10000);
        conta1.sacar(1500);
        conta1.extrato();

    }

}
