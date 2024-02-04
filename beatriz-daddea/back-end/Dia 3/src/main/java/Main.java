import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite seu Nome: ");
    String nome = scanner.next();
    
    System.out.print("Digite seu Salário Fixo: ");
    double salario = scanner.nextDouble();
    
    System.out.print("Digite seu Total de Vendas no mês: ");
    double totalVendas = scanner.nextDouble();

    scanner.close();

    double comissao = totalVendas * 0.15;
    double salarioFinal = salario + comissao;
    System.out.printf("O colaborador(a) " + nome + " reberá o salário de = R$%.2f\n", salarioFinal);
  }
}