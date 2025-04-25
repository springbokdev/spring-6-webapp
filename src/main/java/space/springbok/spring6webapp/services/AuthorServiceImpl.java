package space.springbok.spring6webapp.services;

import org.springframework.stereotype.Service;
import space.springbok.spring6webapp.domain.Author;
import space.springbok.spring6webapp.repositories.AuthorRepository;

/**
 * @author John Spangenberg
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
