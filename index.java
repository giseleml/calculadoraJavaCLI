import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    while (true) {
      System.out.println(" \n * CALCULADORA * \n Digite o número equivalente a operação desejada: \n\n 1: + (Adição) \n 2: - (Subtração) \n 3: * (Multiplicação) \n 4: / (Divisão) \n Digite 0 para encerrar.");
      Scanner scan = new Scanner(System.in);
      int option = scan.nextInt();

      if (option == 0) {
        scan.close();
        break;
      }

      System.out.println("Digite o primeiro número da operação: ");
      int num1 = scan.nextInt();
      System.out.println("Digite o segundo número da operação: ");
      int num2 = scan.nextInt();

      switch (option) {
      case 1:
        System.out.printf("Resultado: %d \n", num1 + num2);
        break;
      case 2:
        System.out.printf("Resultado: %d \n", num1 - num2);
        break;
      case 3:
        System.out.printf("Resultado: %d \n", num1 * num2);
        break;
      case 4:
        System.out.printf("Resultado: %d \n", num1 / num2);
        break;
      default:
        System.out.printf("Operador inválido.");
      }
      continue;
    }
  }
}