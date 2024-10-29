import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ej01 ejercicio1 = new Ej01();
        Ej02 ejercicio2 = new Ej02();
        Ej03 ejercicio3 = new Ej03();
        Ej04 ejercicio4 = new Ej04();
        Ej05 ejercicio5 = new Ej05();
        Ej06 ejercicio6 = new Ej06();
        Ej07 ejercicio7 = new Ej07();
        Ej08 ejercicio8 = new Ej08();
        Ej09 ejercicio9 = new Ej09();
        Ej10 ejercicio10 = new Ej10();
        Ej11 ejercicio11 = new Ej11();
        Ej12 ejercicio12 = new Ej12();
        Inventario ejercicio14 = new Inventario();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenú:");
            System.out.println(" 1. Ejercicio 1");
            System.out.println(" 2. Ejercicio 2");
            System.out.println(" 3. Ejercicio 3");
            System.out.println(" 4. Ejercicio 4");
            System.out.println(" 5. Ejercicio 5");
            System.out.println(" 6. Ejercicio 6");
            System.out.println(" 7. Ejercicio 7");
            System.out.println(" 8. Ejercicio 8");
            System.out.println(" 9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("11. Ejercicio 11");
            System.out.println("12. Ejercicio 12");
            System.out.println("13. Ejercicio 13");
            System.out.println("14. Ejercicio 14");
            System.out.println("15. Salir");
            System.out.print("Elige una opción (1-15): ");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> ejercicio1.pedirNombre();
                case 2 -> ejercicio2.pedirNum();
                case 3 -> ejercicio3.pedirRadio();
                case 4 -> ejercicio4.adivinarNum();
                case 5 -> ejercicio5.tablaMultiplicar();
                case 6 -> ejercicio6.suma();
                case 7 -> ejercicio7.cadenaReverse();
                case 8 -> ejercicio8.contarVocales();
                case 9 -> ejercicio9.esPrimo();
                case 10 -> {
                    ejercicio10.FahrenheitToCelsius();
                    ejercicio10.CelsiusToFahrenheit();
                }
                case 11 -> ejercicio11.secuenciaFibonacci();
                case 12 -> ejercicio12.numReverse();
                case 13 -> System.out.println(Anime.crearAnime());
                case 14 -> {
                    Videojuego videojuego = ejercicio14.crearVideojuego();
                    ejercicio14.insertVideojuego(videojuego);
                    ejercicio14.mostrarInventario();
                    ejercicio14.deleteVideojuego(videojuego);
                }
                case 15 -> {
                    System.out.println("Saliendo del menú. ¡Hasta luego!");
                    return;
                }
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
}