package Semana2;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese la coordenada x del primer punto: ");
        double x1 = lectura.nextDouble();
        System.out.print("Ingrese la coordenada y del primer punto: ");
        double y1 = lectura.nextDouble();
        System.out.print("Ingrese la coordenada x del segundo punto: ");
        double x2 = lectura.nextDouble();
        System.out.print("Ingrese la coordenada y del segundo punto: ");
        double y2 = lectura.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("La distancia entre los puntos (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es: " + distancia);

        lectura.close();
    }
}
