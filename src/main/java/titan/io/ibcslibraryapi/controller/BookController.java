package titan.io.ibcslibraryapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import titan.io.ibcslibraryapi.service.BookService;

@Slf4j
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    // get all book
    // get book by id
    // post one book
    // post all book
    // delete book by id
    // delete book by obj
    // update book by obj
}
