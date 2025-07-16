// src/models/Book.java
package models;

import java.util.Objects;

public class Book {
    private String titulo, autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor  = autor;
        this.anio   = anio;
    }

    public String getTitulo() { return titulo; }
    public String getAutor()  { return autor;  }
    public int    getAnio()   { return anio;   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book b = (Book) o;
        return anio == b.anio
            && Objects.equals(titulo, b.titulo)
            && Objects.equals(autor,  b.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, anio);
    }

    @Override
    public String toString() {
        return "LIBRO:"+ "\tTitulo: " + titulo + ",\n\t autor: " + autor + ", anio=" + anio+"\n";
    }
}
