package biblioteca;

import java.util.ArrayList;
import java.util.List;

//TODO: Documentar la clase
/**
 * Clase que representa una biblioteca con una colección de libros
 * Permite agregar, eliminar y buscar libros por título y por autor
 *
 * @see Libro
 * @author Eva Lopez
 * @version 4.3.2025
 */
public class Biblioteca {

    // TODO: Documentar estos atributos
    /** Lista de libros disponibles en la biblioteca */
    private final List<Libro> lista;

    // TODO: Documentar este método
    /** Constructor por defecto de la biblioteca sin libros */
    public Biblioteca() {
        lista = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    /** Constructor con parámetros.
     *
     * @param libros Lista de libros con la que se inicializa
     *               la biblioteca. Lo referenciamos para indicar que hay una clase Libro
     */
    public Biblioteca(List<Libro> libros) {
        this.lista = libros;
    }

    // TODO: Documentar este metodo
    //  Test: Comprobar si se ha agregado
    /**
     * Agrega un libro a la biblioteca
     * @param libro Un libro para agregar
     *
     * @return {@code true} si el libro se ha agregado
     * correctamente o {@code false} si el libro NO se
     * ha agregado correctamente
     */
    public boolean agregarLibro(Libro libro) {
        return lista.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return lista.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Devuelve la lista de libros de la biblioteca
     * @return lista de libros de la biblioteca
     */
    public List<Libro> getLibros() {
        return lista;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     *
     * @param titulo titulo del libro a encontrar
     * @return libro de la biblioteca por título
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : lista) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo

    /**
     * @deprecated  Este metodo ha quedado obsoleto
     * Se recomienda usar {@link #encuentraLibrosPorAutor(String)} en su lugar
     * @param autor autor del libro
     * @return libro localizado según el autor
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : lista) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test 01: Comprobar la lista de libros que devuelve para un autor existente.
    //  Test 02: Comprobar la lista de libros que devuelve para un autor NO existente

    /**
     * Busca todos los libros de un autor determinado
     * @since V2.0
     * Sustituye al metodo {@link #encuentraLibroPorTitulo(String)}
     * @param autor autor del libro
     * @return lista de libros de un determinado autor
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : lista) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}