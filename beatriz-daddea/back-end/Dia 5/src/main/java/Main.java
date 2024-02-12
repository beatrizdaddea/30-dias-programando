import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número entre 1 e 9: ");
    
    int number = scanner.nextInt();
    scanner.close();

    if (number >= 1 && number <= 9) {
      System.out.println("O número" + number + "é dentro do valor permitido");
    } else{
         System.out.println("O número " + number + " é fora do valor permitido");
    }
  }
}