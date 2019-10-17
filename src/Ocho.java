import java.util.Scanner;

public class Ocho {
    public static void main(String[] args) {
        Double A, B, C, D, X, Y, distancia;
        Scanner face=new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        A=face.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        B=face.nextDouble();
        System.out.println("Ingrese el valos de C: ");
        C=face.nextDouble();
        System.out.println("Ingrese el valor de D: ");
        D=face.nextDouble();
        X= B - A;
        Y= D - C;
        distancia = Math.sqrt(Math.pow(X, 2)  + Math.pow(Y, 2) );
        System.out.println("La distancia es de: " + distancia );

    }
}
