/*
3. Cálculo del área de un círculo
 Pedir al usuario el radio de un círculo y calcular su área (A = π * r^2).
 */

import java.util.Scanner;

public class Ej03 {
    public void pedirRadio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        try {
            double radio = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * (radio * radio);
            System.out.println("Área: " + area);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
