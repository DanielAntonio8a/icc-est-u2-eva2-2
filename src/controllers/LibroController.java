package controllers;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.Book;

public class LibroController {

    public Map<Book, Book> procesarLibros(List<Book> libros) {
        Comparator<Book> cmp = Comparator
            .comparing(Book::getTitulo, Comparator.reverseOrder())
            .thenComparingInt(Book::getAnio);

        TreeMap<Book,Book> mapa = new TreeMap<>(cmp);
        if (libros != null) {
            for (Book b : libros) {
                if (!mapa.containsKey(b)) {
                    mapa.put(b, b);
                }
            }
        }
        return mapa;
    }
}
