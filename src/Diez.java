import java.util.Scanner;

public class Diez {
    public static void main(String[] args) {
        double medidaPulgadas,medidaMetros;
        Scanner face=new Scanner(System.in);
        System.out.println("Ingrese medida en metros: ");
        medidaMetros=face.nextInt();
        medidaPulgadas=medidaMetros/0.0254;
        System.out.println("La medida en pulgadas es: " +medidaPulgadas);
    }
}
