/*
13. Clase Anime sencilla
 Crear una clase Anime con los atributos nombre, episodios y género. Luego, permitir al
 usuario crear un objeto de tipo Anime con estos atributos y mostrar su información.
 */

import java.util.Scanner;

class Anime {
    private final String nombre;
    private final int episodios;
    private final String genero;

    public Anime(String nombre, int episodios, String genero) {
        this.nombre = nombre;
        this.episodios = episodios;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", episodios: " + episodios + " y género: " + genero;
    }

    public static Anime crearAnime() {
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        int episodios = 0;
        String genero = "";

        try {
            System.out.println("Introduce el nombre:");
            nombre = scanner.nextLine();
            System.out.println("Introduce el número de episodios:");
            episodios = Integer.parseInt(scanner.nextLine());
            System.out.println("Introduce el género:");
            genero = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return new Anime(nombre, episodios, genero);
    }
}