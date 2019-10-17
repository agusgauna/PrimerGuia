import java.util.Scanner;

public class Dos {
    public static void main(String[] args) {
        double calificationOne, calificationTwo, calificationThree, calificationFour, average;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingresa la primera calificacion: ");
        calificationOne = keyboard.nextDouble();
        System.out.print("Ingresa la segunda calificacion: ");
        calificationTwo = keyboard.nextDouble();
        System.out.print("Ingresa la tercera calificacion: ");
        calificationThree = keyboard.nextDouble();
        System.out.print("Ingresa la cuarta calificacion: ");
        calificationFour= keyboard.nextDouble();
        average= (calificationOne + calificationTwo + calificationThree + calificationFour ) / 4;
        System.out.print("El promedio de calificaciones es: " + average);
    }
}
