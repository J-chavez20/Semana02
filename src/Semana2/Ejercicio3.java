package Semana2;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
       Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese la velocidad inicial (m/s): ");
        double velocidadInicial = lectura.nextDouble();
        System.out.print("Ingrese el ángulo de lanzamiento (grados): ");
        double anguloGrados = lectura.nextDouble();
        double anguloRadianes = Math.toRadians(anguloGrados);
        double gravedad = 9.8;
        System.out.print("Ingrese el tiempo total de simulación (s): ");
        double tiempoTotal = lectura.nextDouble();
        System.out.print("Ingrese el intervalo de tiempo para la simulación (s): ");
        double intervaloTiempo = lectura.nextDouble();
        System.out.println("\nTiempo (s)\tPosición X (m)\tPosición Y (m)");
        for (double t = 0; t <= tiempoTotal; t += intervaloTiempo) {
            double x = velocidadInicial * Math.cos(anguloRadianes) * t;
            double y = velocidadInicial * Math.sin(anguloRadianes) * t - 0.5 * gravedad * Math.pow(t, 2);
            System.out.printf("%.2f\t\t%.2f\t\t%.2f%n", t, x, y);
            if (y < 0) {
                break;
            }
        }

        lectura.close();
}
}
