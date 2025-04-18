package space.springbok.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import space.springbok.spring6webapp.domain.Publisher;

/**
 * @author John Spangenberg
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
