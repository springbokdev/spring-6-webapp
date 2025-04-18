package space.springbok.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import space.springbok.spring6webapp.domain.Book;

/**
 * @author John Spangenberg
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
