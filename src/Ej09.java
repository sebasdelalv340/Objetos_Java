/*
9. Números primos
 Pedir un número al usuario y verificar si es un número primo.
 */

import java.util.Scanner;

public class Ej09 {

    private boolean numPrimo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num;
        try {
            num = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void esPrimo() {
        if (numPrimo()) {
            System.out.println("El número introducido es primo.");
        } else {
            System.out.println("El número introducido no es primo.");
        }
    }
}
