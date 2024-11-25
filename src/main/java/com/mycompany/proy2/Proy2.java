/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proy2;
import java.util.ArrayList;
import java.util.Scanner;

class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private String fecha;

    // Constructor
    public Libro(String titulo, String autor, String fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }

    // Métodos (Getters y funcionalidad)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return fecha;
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", fecha de publicacion: " + fecha);
    }
}

class Biblioteca {
    // Atributo
    private ArrayList<Libro> libros;

    // Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // Métodos
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public void mostrarTodosLosLibros() {
        System.out.println("Lista de libros:");
        if (libros.isEmpty()) {
            System.out.println("No hay libros.");
        } else {
            for (Libro libro : libros) {
                libro.mostrarInformacion();
            }
        }
    }
}
/**
 *
 * @author JANETH
 */
public class Proy2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcion;
        do {
            System.out.println("\n   Menu");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el titulo del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Introduce el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Introduce la fecha de publicacion del libro: ");
                    String isbn = scanner.nextLine();
                    Libro libro = new Libro(titulo, autor, isbn);
                    biblioteca.agregarLibro(libro);
                    break;

                case 2:
                    biblioteca.mostrarTodosLosLibros();
                    break;

                case 3:
                    System.out.println("¡ADIOS!");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 3);

        scanner.close();
    }
        
}

