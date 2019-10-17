import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        int altura, base, area;
        Scanner face = new Scanner(System.in);
        System.out.print("Ingrese medida de altura: ");
        altura = face.nextInt();
        System.out.print("Ingrese medida de base: ");
        base = face.nextInt();

        area = (base * altura);
        System.out.print("La area es igual: " + area );
    }
}
