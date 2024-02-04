import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a nota do Primeiro Bimestre: ");
    int n1 = scanner.nextInt();

    System.out.print("Digite a nota do Segundo Bimestre: ");
    int n2 = scanner.nextInt();

    System.out.print("Digite a nota do Terceiro Bimestre: ");
     int n3 = scanner.nextInt();

    System.out.print("Digite a nota do Quarto Bimestre: ");
     int n4 = scanner.nextInt();

    scanner.close();

    int calculaMedia = (n1 + n2 + n3 + n4) / 4;

    if (calculaMedia >= 60) {
       System.out.print("Aluno Aprovado com Média:" + calculaMedia);
    } else {
       System.out.print("Aluno Reprovado com Média:" + calculaMedia);

    }
  }

}