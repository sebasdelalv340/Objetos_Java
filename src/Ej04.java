/*
4. Generador de números aleatorios
 Generar un número aleatorio entre 1 y 100 y pedir al usuario que adivine qué número es.
 El programa indicará si el número es mayor o menor al ingresado.
 Pista: Utilizar la función de generación de números aleatorios y bucles while o do-while.
 */

import java.util.Random;
import java.util.Scanner;

public class Ej04 {
    public void adivinarNum() {
        Random random = new Random();
        int numRandom = random.nextInt(99) + 1;
        System.out.print("Intenta adivinar el número entre 1 y 100: ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                if (num < numRandom) {
                    System.out.print("El número es mayor al ingresado. Inténtelo de nuevo: ");
                } else if (num > numRandom) {
                    System.out.print("El número es menor al ingresado. Inténtelo de nuevo: ");
                } else {
                    System.out.println("Ha acertado");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Inténtelo de nuevo.");
            }
        }
    }
}
