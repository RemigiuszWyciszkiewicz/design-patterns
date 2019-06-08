package com.company;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class LibraryService {

    public static void main(final String... args) {
        new LibraryService().findContentByAuthorAndTitle("GoF", "Design Patterns").entrySet()
                .forEach(b -> System.out.println(b.getKey() + " --> " + b.getValue()));
    }
    /**
     * Finds the right book for our test purposes and then loads its content.
     */
    public Map<String, String> findContentByAuthorAndTitle(String author, String title) {
        return filterByTitle(filterByAuthor(findAllBooks(), author), title)
                .collect(toMap(Book::getTitle, Book::getContent));
    }
    /*
     * The following methods are really simple and I think straightforward too.
     */
    private Stream<Book> findAllBooks() {
        return Stream.of(
                new ProxyBook("Design Patterns", "Gabor Laszlo Hajba"),
                new ProxyBook("Design Patterns", "GoF"),
                new ProxyBook("Python 3 in Anger", "Gabor Laszlo Hajba"),
                new ProxyBook("Design Patterns", "Head First"));
    }
    private Stream<Book> filterByAuthor(Stream<Book> books, String author) {
        return books.filter(b -> author.equals(b.getAuthor()));
    }
    private Stream<Book> filterByTitle(Stream<Book> books, String title) {
        return books.filter(b -> title.equals(b.getTitle()));
    }
}
