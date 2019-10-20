package lk.icoder.queryapp.repository;

import lk.icoder.queryapp.entity.Book;

import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/13/2019
 */
public interface BookRepositoryCustom {

    List<Book> findBooksByAuthorNameAndTitle(String authorName, String title);
}
