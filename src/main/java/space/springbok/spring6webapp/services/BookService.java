package space.springbok.spring6webapp.services;

import space.springbok.spring6webapp.domain.Book;

/**
 * @author John Spangenberg
 */
public interface BookService {

    Iterable<Book> findAll();
}
