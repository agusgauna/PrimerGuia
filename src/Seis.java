import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        int base, hipotenusa;
        double cateto, areaTriangulo, areaCircular, areaTotal;
        Scanner face= new Scanner(System.in);

        System.out.print("Ingrese la base del triangulo/radio: ");
        base= face.nextInt();
        System.out.print("Ingrese el valor de la hipotenusa: ");
        hipotenusa= face.nextInt();

        cateto = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(base, 2));
        areaTriangulo = (2*base*cateto) / 2;
        areaCircular= (Math.PI * Math.pow(base, 2)) / 2;
        areaTotal= areaTriangulo + areaCircular;

        System.out.println("El area total de la figura total es: " + areaTotal);
    }
}
