
package Semana2;
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio1 {
    public static void main(String[] args) {
Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresa el valor minimo del rango: ");
        int min = lectura.nextInt();
        System.out.print("Ingresa el valor maximo del rango: ");
        int max = lectura.nextInt();
        if (max >= min) {
            int randomNum = (int) (Math.random() * (max - min + 1)) + min;
            System.out.println("Numero aleatorio entre " + min + " y " + max + ": " + randomNum);
        } else {
            System.out.println("El valor máximo debe ser mayor o igual al valor mínimo.");
        }
        lectura.close();
    }
    
}
