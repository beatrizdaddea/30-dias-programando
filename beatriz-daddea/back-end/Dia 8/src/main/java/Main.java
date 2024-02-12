public class Main {
  public static void main(String[] args) {
    int[] v1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] v2 = { 2, 3, 4, 5, 6, 7, 8, 9, 0 };
    
    int[] resultado = new int[v1.length];
    
    for (int i = 0; i < v1.length; i++) {
        resultado[i] = v1[i] * v2[i];
    }

    System.out.print("Resultado da multiplicação: ");
    for (int i = 0; i < resultado.length; i++) {
        System.out.print(resultado[i] + " ");
    }
  }
}