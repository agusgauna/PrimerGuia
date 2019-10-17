import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        int areaTriangulo, areaRectangulo, areaFigura, A, B,C;
        Scanner face = new Scanner(System.in);
        System.out.print("Ingrese valor de A: ");
        A = face.nextInt();
        System.out.print("Ingrese valor de B: ");
        B = face.nextInt();
        System.out.print("Ingrese valor de C: ");
        C = face.nextInt();

        areaTriangulo = ( B *(A-C)) / 2;
        System.out.println("El area del triangulo es: " + areaTriangulo);
        areaRectangulo = (B * C);
        System.out.println("El area del rectangulo es: " + areaRectangulo);
        areaFigura = (areaTriangulo + areaRectangulo);
        System.out.println("El area de la figura es: " + areaFigura);
    }
}
