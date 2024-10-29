/*
5. Tabla de multiplicar
 Pedir un número al usuario e imprimir su tabla de multiplicar del 1 al 10.
 */

import java.util.Scanner;

public class Ej05 {
    public void tablaMultiplicar() {
        System.out.print("Introduce un número entero: ");
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            num = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Entrada inválida: " + e.getMessage());
            return; // Salir si la entrada es inválida
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + ": " + (i * num));
        }

        scanner.close();
    }
}
