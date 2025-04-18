package space.springbok.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import space.springbok.spring6webapp.domain.Author;

/**
 * @author John Spangenberg
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
