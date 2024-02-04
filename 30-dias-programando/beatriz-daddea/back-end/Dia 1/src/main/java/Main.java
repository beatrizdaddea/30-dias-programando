import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        scanner.close();

        double resultado = n1 + n2;

        System.out.println("A soma de " + n1 + " e " + n2 + " é: " + resultado);
    }
}
