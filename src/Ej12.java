/*
12. Inversión de un número
 Pedir un número entero al usuario e imprimir el número con sus dígitos invertidos.
 Ejemplo: si el usuario ingresa 1234, el programa debería imprimir 4321.
 */

import java.util.Scanner;

public class Ej12 {
    public void numReverse() {
        System.out.print("Introduce un número entero: ");
        String num = "";
        Scanner scanner = new Scanner(System.in);

        try {
            num = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        String numNuevo = new StringBuilder(num).reverse().toString();
        System.out.println(numNuevo);
        scanner.close();
    }
}
