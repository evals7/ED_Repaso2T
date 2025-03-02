package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    void setUp() {
        libro = new Libro("The Art of Computer Programming", "Donald Knuth", 1968);

    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(this.libro));
    }

    @Test
    void eliminarLibro() { //NO FUNCIONA
        biblioteca.agregarLibro(libro);
        assertTrue(biblioteca.eliminarLibro(this.libro));
    }

    @Test
    void getLibros() {
        List<Libro> lista = new ArrayList<>();
        assertEquals(biblioteca.getLibros(), lista);
    }

    @Test
    void encuentraLibroPorTitulo() {
        biblioteca.agregarLibro(libro);
        assertNotNull(biblioteca.encuentraLibroPorTitulo(libro.getTitulo()));
    }

    @Test
    void encuentraLibrosPorAutor() { //PRUEBA DE LUIS, NO ESTÁ PROBANDO LOS MÉTODOS POR AUTOR
        /*Biblioteca biblio = new Biblioteca(); //creamos una biblioteca nueva
        biblio.agregarLibro(libro); //añadimos un libro nuevo

        assertNotNull(biblio.getLibros()); //comprobamos que getLibros es distinto de nulo
        assertEquals(1, biblio.getLibros().size()); //comprobando que no está vacía (size es 1)
        assertTrue(biblio.getLibros().contains(libro)); //comprobando que contiene el libro añadido
        */
        biblioteca.agregarLibro(libro);
        assertNotNull(biblioteca.encuentraLibrosPorAutor(libro.getAutor()));
        assertNull(biblioteca.encuentraLibrosPorAutor("A"));

    }
}