/*
11. Fibonacci
 Crear un programa que imprima los primeros N números de la secuencia de Fibonacci (el
 número N lo ingresa el usuario).
 */

import java.util.Scanner;

public class Ej11 {
    public void secuenciaFibonacci() {
        System.out.print("Introduce un número entero: ");
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            num = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        int a = 0;
        int b = 1;
        int suma;
        System.out.println(num + " números Fibonacci:");
        for (int i = 0; i < num; i++) { // Cambiar el rango para mostrar la cantidad correcta de números
            if (i <= 1) {
                suma = i; // Los dos primeros números de Fibonacci son 0 y 1
            } else {
                suma = a + b;
                a = b;
                b = suma;
            }
            System.out.println("\t- " + suma);
        }
        scanner.close();
    }
}
