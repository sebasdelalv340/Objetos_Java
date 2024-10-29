/*
 7. Reverso de una cadena
 Pedir una cadena al usuario e imprimirla al revés.
 */

import java.util.Scanner;

public class Ej07 {
    public void cadenaReverse() {
        System.out.print("Introduce una palabra: ");

        try (Scanner scanner = new Scanner(System.in)) {
            String palabra = scanner.nextLine();
            String reversed = new StringBuilder(palabra).reverse().toString();
            System.out.println(reversed);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}