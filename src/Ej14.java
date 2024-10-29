/*
14. Inventario de videojuegos
 Crear una clase Videojuego con los atributos titulo, plataforma y horasJugadas. Permitir al
 usuario crear un inventario con varios videojuegos. El programa debe permitir añadir,
 eliminar y mostrar los videojuegos del inventario.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Videojuego {
    private final String titulo;
    private final String plataforma;
    private final int horasJugadas;

    public Videojuego(String titulo, String plataforma, int horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.horasJugadas = horasJugadas;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", plataforma: " + plataforma + ", horas jugadas: " + horasJugadas;
    }
}

class Inventario {
    private final List<Videojuego> inventario = new ArrayList<>();

    public Videojuego crearVideojuego() {
        Scanner scanner = new Scanner(System.in);
        String titulo = "";
        String plataforma = "";
        int horasJugadas = 0;

        try {
            System.out.println("Introduce el nombre:");
            titulo = scanner.nextLine();
            System.out.println("Introduce la plataforma:");
            plataforma = scanner.nextLine();
            System.out.println("Introduce las horas jugadas:");
            horasJugadas = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return new Videojuego(titulo, plataforma, horasJugadas);
    }

    public void insertVideojuego(Videojuego videojuego) {
        inventario.add(videojuego);
    }

    public void deleteVideojuego(Videojuego videojuego) {
        inventario.remove(videojuego);
    }

    public void mostrarInventario() {
        inventario.forEach(System.out::println);
    }
}
