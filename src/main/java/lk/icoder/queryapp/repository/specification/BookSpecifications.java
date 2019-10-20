package lk.icoder.queryapp.repository.specification;

import lk.icoder.queryapp.entity.Book;
import lk.icoder.queryapp.entity.Book_;
import org.springframework.data.jpa.domain.Specification;

/**
 * @Project query-app
 * @Author DILAN on 10/16/2019
 */
public class BookSpecifications {

    public static Specification<Book> hasAuthor(String author) {
        return (book, cq, cb) -> cb.equal(book.get(Book_.author), author);
    }

    public static Specification<Book> titleContains(String title) {
        return (book, cq, cb) -> cb.like(book.get(Book_.title), "%" + title + "%");
    }
}
