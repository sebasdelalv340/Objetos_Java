/*
 6. Sumar números del 1 al 100
 Crear un programa que sume todos los números del 1 al 100.
 */

public class Ej06 {
    public void suma() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("La suma de todos los números del 1 al 100 es " + suma);
    }
}
