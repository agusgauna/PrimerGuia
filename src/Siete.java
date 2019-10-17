import java.util.Scanner;

public class Siete {
    public static void main(String[] args) {
        double cantGalon, cantLitros, precioGalon, ganancia;
        Scanner face=new Scanner(System.in);
        System.out.println("Ingrese cantidad de litros: ");
        cantLitros=face.nextDouble();
        System.out.println("Ingrese precio por galon: ");
        precioGalon=face.nextDouble();
        cantGalon= cantLitros/3.785;
        ganancia=precioGalon*cantGalon;
        System.out.println("La ganancia total es: " + ganancia );
    }
}
