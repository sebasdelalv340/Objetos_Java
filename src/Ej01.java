/*
1. Saludo personalizado
Pedir al usuario su nombre y saludarle con un mensaje personalizado. Ejemplo: "¡Hola,
Juan!".
 */

import java.util.Scanner;

public class Ej01 {
    public void pedirNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        try {
            String nombre = scanner.nextLine();
            System.out.println("¡Hola, " + nombre + "!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
