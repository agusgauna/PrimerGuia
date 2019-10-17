import java.util.Scanner;

public class Nueve {
    public static void main(String[] args) {
        int horasTrabajadas, pagoHora, sueldoSemanal;
        Scanner face=new Scanner(System.in);
        System.out.println("Ingrese cantidad de horas trabajadas: ");
        horasTrabajadas=face.nextInt();
        System.out.println("Ingrese pago por hora: ");
        pagoHora=face.nextInt();
        sueldoSemanal = horasTrabajadas * pagoHora;
        System.out.println("El sueldo semanal es: " +sueldoSemanal);
    }
}
