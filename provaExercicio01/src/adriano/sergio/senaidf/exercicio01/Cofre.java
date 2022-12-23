package adriano.sergio.senaidf.exercicio01;

import java.util.Scanner;

public class Cofre {
    /*1) Deseja-se criar uma aplicação de autenticação de usuarios em um cofre. Faça essa aplicação em JAVA onde o
    usuário so tera 3 tentativas de inserir a senha, caso exceda o limite deverá ser exibida uma mensagem ao usuario
    que seu acesso foi bloqueado e necessitara entrar em contato com o suporte. A senha do cofre é: 335599. Anexe seu
    codigo java nesta questão.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua senha:");
        String senha1 = scanner.nextLine();
        int contador = 1;

        while (!senha1.equals("335599") && contador <= 2) {
            System.out.println("Senha Incorreta. \nTentativas Restante: " + (3 - contador));
            contador++;
            senha1 = scanner.nextLine();
        }
        System.out.println();
        if (senha1.equals("335599")) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Número de tentativas expirou. Acesso bloqueado.(Senha incorreta)");
        }


        scanner.close();

      
    }


}




