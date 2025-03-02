package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    Libro libro = new Libro("Clean Code", "Robert C. Martin ", 2009); //solo inicializamos, los campos los rellenamos en el BeforeEach
    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    void setUp() {
        libro = new Libro("Clean Code", "Robert C. Martin ", 2009);
    }

    @Test
    void getTitulo() {
        assertEquals(libro.getTitulo(), "Clean Code");
    }

    @Test
    void setTitulo() {
    }

    @Test
    void getAutor() {
        assertEquals(libro.getAutor(), "Robert C. Martin ");
    }

    @Test
    void setAutor() {
    }

    @Test
    void getAnioPublicacion() {
        assertEquals(libro.getAnioPublicacion(), 2009);
    }

    @Test
    void setAnioPublicacion() {
    }
}