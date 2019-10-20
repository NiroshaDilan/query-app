package lk.icoder.queryapp.controller;

import lk.icoder.queryapp.entity.Book;
import lk.icoder.queryapp.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Project query-app
 * @Author DILAN on 10/13/2019
 */
@RestController
@RequestMapping("/api")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book-by-author-and-name/{author-name}/{title}")
    public ResponseEntity<List<Book>> findBooksByAuthorNameAndTitle(@PathVariable("author-name") String authorName,
                                                                    @PathVariable("title") String title) {

//        List<Book> booksByAuthorNameAndTitle = bookService.findBooksByAuthorNameAndTitle(authorName, title);
//        List<Book> booksByAuthorNameAndTitle = bookService.findAllByAuthor(title);
        List<Book> booksByAuthorNameAndTitle = bookService.findAllByAuthorAndTitle(authorName, title);
        return new ResponseEntity<>(booksByAuthorNameAndTitle, HttpStatus.OK);
    }
}
