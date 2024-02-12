import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    String correctLogin = "admin";
    String correctPassword = "admin";

    Scanner scanner = new Scanner(System.in);

    String login;
    String password;

    do {
      System.out.println("Digite seu login: ");
      login = scanner.next();

      System.out.println("Digite sua senha: ");
      password = scanner.next();

      if (!correctLogin.equals(login) || !correctPassword.equals(password)) {
        System.out.println("ACESSO NEGADO");
      } else {
        System.out.println("ACESSO CONCEDIDO");
      }
    } while (!correctLogin.equals(login) || !correctPassword.equals(password));

    scanner.close();
  }
}
