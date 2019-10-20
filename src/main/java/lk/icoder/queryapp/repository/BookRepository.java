package lk.icoder.queryapp.repository;

import lk.icoder.queryapp.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Project query-app
 * @Author DILAN on 10/13/2019
 */
public interface BookRepository extends JpaRepository<Book, Long>, BookRepositoryCustom, JpaSpecificationExecutor<Book> {
}
