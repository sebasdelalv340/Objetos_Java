/*
8. Contador de vocales
 Pedir una frase al usuario y contar cuántas vocales (a, e, i, o, u) contiene.
 */

import java.util.Scanner;

public class Ej08 {
    public void contarVocales() {
        String vocales = "aeiou";
        System.out.print("Introduce una frase: ");

        try (Scanner scanner = new Scanner(System.in)) {
            String frase = scanner.nextLine().toLowerCase();
            System.out.println("'" + frase + "' tiene:");
            for (char vocal : vocales.toCharArray()) {
                long count = frase.chars().filter(ch -> ch == vocal).count();
                System.out.println("\t-" + vocal + ": " + count);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
