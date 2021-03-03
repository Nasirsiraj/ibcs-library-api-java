package titan.io.ibcslibraryapi.service;

import com.sun.istack.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import titan.io.ibcslibraryapi.model.Book;
import titan.io.ibcslibraryapi.repository.BookRepository;

import java.util.List;

@Slf4j
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    // get all book
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    // get book by id
    public Book getBookById(@NotNull int id){
        return bookRepository.findById(id).orElse(null);
    }
    // post one book
    public Book postOneBook(@NotNull Book book){
        return bookRepository.save(book);
    }
    // post all book
    public List<Book> postAllBook(@NotNull List<Book> bookList){
        return bookRepository.saveAll(bookList);
    }
    // delete book by id
    public String deleteBookById(@NotNull int id){
        Book existingBook = bookRepository.findById(id).orElse(null);
        if(existingBook == null){
            return "no book found, id: " + id;
        }else{
            bookRepository.deleteById(id);
            return "book deleted, id: " + id;
        }
    }
    // delete book by obj
    public String deleteBookByObj(@NotNull Book book){
        Book existingBook = bookRepository.findById(book.getId()).orElse(null);
        if(existingBook == null){
            return "no book found, id: " + book.getId();
        }else{
            bookRepository.delete(book);
            return "book deleted, id: " + book.getId();
        }
    }
    // update book by obj
    public Book updateBookByObj(@NotNull Book book){
        Book existingBook = bookRepository.findById(book.getId()).orElse(null);
        if(existingBook == null){
            return null;
        }else{
            existingBook.setName(book.getName());
            existingBook.setSubject(book.getSubject());
            existingBook.setWriter(book.getWriter());
            existingBook.setPage(book.getPage());

            return bookRepository.save(existingBook);
        }
    }
}
