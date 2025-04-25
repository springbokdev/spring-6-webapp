package space.springbok.spring6webapp.services;

import org.springframework.stereotype.Service;
import space.springbok.spring6webapp.domain.Book;
import space.springbok.spring6webapp.repositories.BookRepository;

/**
 * @author John Spangenberg
 */
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

}
