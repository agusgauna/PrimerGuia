import java.util.Scanner;

public class Cuatro {
    public static void main(String[] args) {
        int radio;
        double area;
        final double PI = Math.PI;
        Scanner face = new Scanner(System.in);
        System.out.print("Ingrese medida de radio: ");
        radio = face.nextInt();
        area = (PI*radio*radio);
        System.out.print("El area de la circunferencia es: " + area);
    }
}
