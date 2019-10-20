package lk.icoder.queryapp.service.impl;

import lk.icoder.queryapp.entity.Book;
import lk.icoder.queryapp.repository.BookRepository;
import lk.icoder.queryapp.service.BookService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

import static lk.icoder.queryapp.repository.specification.BookSpecifications.hasAuthor;
import static lk.icoder.queryapp.repository.specification.BookSpecifications.titleContains;
import static org.springframework.data.jpa.domain.Specification.where;

/**
 * @Project query-app
 * @Author DILAN on 10/13/2019
 */
@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findBooksByAuthorNameAndTitle(String authorName, String title) {
        return bookRepository.findBooksByAuthorNameAndTitle(authorName, title);
    }

    @Override
    public List<Book> findAllByAuthor(String authorName) {
        return bookRepository.findAll(hasAuthor(authorName));
    }

    @Override
    public List<Book> findAllByAuthorAndTitle(String authorName, String tile) {
        return bookRepository.findAll(where(hasAuthor(authorName)).and(titleContains(tile)));
    }
}
