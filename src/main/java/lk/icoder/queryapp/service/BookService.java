package lk.icoder.queryapp.service;

import lk.icoder.queryapp.entity.Book;

import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/13/2019
 */
public interface BookService {

    List<Book> findBooksByAuthorNameAndTitle(String authorName, String title);

    List<Book> findAllByAuthor(String authorName);

    List<Book> findAllByAuthorAndTitle(String authorName, String tile);
}
