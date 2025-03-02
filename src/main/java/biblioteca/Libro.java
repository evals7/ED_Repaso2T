package biblioteca;

import java.util.Objects;

//TODO: Documentar la clase
/**
 * Clase que representa los libros que contiene la clase Biblioteca
 * @see Biblioteca
 * @author Eva
 * @version 2.3.2025
 */


public class Libro {

    // TODO: Documentar estos atributos
    /** Atributos de la Clase Libro. */
    private String titulo;
    private String autor;
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método
    /**Constructor con campos
     * @param titulo Titulo del libro
     * @param autor Autor del libro
     * @param anioPublicacion año de publicación del libro
     * */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    //Metodo override
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método
    /**Metodo propio para reflejar el autor de un libro
     * @return autor
     * */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método
    /**Metodo propio para obtener el año de publicación de un libro
     * @return anioPublicacion
     * */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}