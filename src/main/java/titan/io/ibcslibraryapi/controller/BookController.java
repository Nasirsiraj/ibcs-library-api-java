package titan.io.ibcslibraryapi.controller;

import com.sun.istack.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import titan.io.ibcslibraryapi.model.Book;
import titan.io.ibcslibraryapi.service.BookService;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookController {
    @Autowired
    private BookService bookService;

    // get all book
    @GetMapping("/books")
    public List<Book> getAllBook(){
        return bookService.getAllBooks();
    }
    // get book by id
    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable @NotNull int id){
        return bookService.getBookById(id);
    }
    // post one book
    @PostMapping("/book")
    public Book postOneBook(@RequestBody @NotNull Book book){
        return bookService.postOneBook(book);
    }
    // post all book
    @PostMapping("/books")
    public List<Book> postAllBook(@RequestBody @NotNull List<Book> bookList){
        return bookService.postAllBook(bookList);
    }
    // delete book by id
    @DeleteMapping("/book/{id}")
    public String deleteBookById(@PathVariable @NotNull int id){
        return bookService.deleteBookById(id);
    }
    // delete book by obj
    @DeleteMapping("/book")
    public String deleteBookByObj(@RequestBody @NotNull Book book){
        return bookService.deleteBookByObj(book);
    }
    // update book by obj
    @PutMapping("/book")
    public Book updateBook(@RequestBody @NotNull Book book){
        return bookService.updateBookByObj(book);
    }
}
