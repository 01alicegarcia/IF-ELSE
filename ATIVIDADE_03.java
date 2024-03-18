import java.util.Scanner;

public class Autenticacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuario: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        
        if (nomeUsuario.equals("usuario") && senha.equals("senha123")) {
            System.out.println("Login bem-sucedido.");
        } else {
            System.out.println("Nome de usuario ou senha incorretos.");
        }

        scanner.close();
    }
}
