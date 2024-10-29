/*
 2. Número par o impar
 Pedir un número al usuario e indicar si es par o impar.
 */

import java.util.Scanner;

public class Ej02 {
    public void pedirNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        try {
            int num = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0) {
                System.out.println(num + " es par");
            } else {
                System.out.println(num + " es impar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
