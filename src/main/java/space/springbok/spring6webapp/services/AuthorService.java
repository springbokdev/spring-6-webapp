package space.springbok.spring6webapp.services;

import space.springbok.spring6webapp.domain.Author;

/**
 * @author John Spangenberg
 */
public interface AuthorService {

    Iterable<Author> findAll();
}
