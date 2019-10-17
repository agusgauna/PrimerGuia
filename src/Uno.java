import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber, result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        firstNumber = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        secondNumber = scanner.nextInt();

        result = firstNumber + secondNumber;
        System.out.printf("El resultado de " + firstNumber + " y " + secondNumber + " es: " + result);
    }
}
