/*
10. Conversión de temperaturas
 Crear un programa que convierta una temperatura de grados Celsius a Fahrenheit y
 viceversa. (C = (F- 32) * 5/9, F = C * 9/5 + 32).
 */

import java.util.Scanner;

public class Ej10 {
    public void CelsiusToFahrenheit() {
        System.out.print("Introduce una temperatura en Celsius: ");
        int grados = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            grados = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        double fah = grados * 9.0 / 5 + 32; // Usar 9.0 para asegurar que la división sea en punto flotante
        System.out.println(grados + " grados Celsius son " + fah + " grados Fahrenheit");
    }

    public void FahrenheitToCelsius() {
        System.out.print("Introduce una temperatura en Fahrenheit: ");
        int grados = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            grados = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        double cel = (grados - 32) * 5.0 / 9; // Usar 5.0 para asegurar que la división sea en punto flotante
        System.out.println(grados + " grados Fahrenheit son " + cel + " grados Celsius");
    }
}
