package lk.icoder.queryapp.repository.impl;

import lk.icoder.queryapp.entity.Book;
import lk.icoder.queryapp.entity.Book_;
import lk.icoder.queryapp.repository.BookRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/13/2019
 */
@Repository
public class BookRepositoryImpl implements BookRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Book> findBooksByAuthorNameAndTitle(String authorName, String title) {


        // First, we get a CriteriaBuilder referencesd
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        // declare the type of a row in the result
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);

        Root<Book> book = cq.from(Book.class);
        List<Predicate> predicates = new ArrayList<>();

        if(authorName != null) {
            predicates.add(cb.equal(book.get(Book_.author), authorName));
        }

//        if (title !=null) {
//            predicates.add(cb.like(book.get(Book_.title), "%" + title + "%"));
//        }

        cq.where(predicates.toArray(new Predicate[0]));

        return entityManager.createQuery(cq).getResultList();
    }
}
