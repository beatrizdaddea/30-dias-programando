import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int[] vetor = new int[40];

    for (int i = 0; i < vetor.length; i++) {
        vetor[i] = random.nextInt(100);
    }

    int contPares = 0;

    for (int i = 0; i < vetor.length; i++) {
        if (vetor[i] % 2 == 0) {
            contPares++;
        }
    }

    System.out.print("Vetor gerado aleatoriamente: ");
    for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
    }

    System.out.println("\nO vetor possui " + contPares + " valores pares.");
  }
}