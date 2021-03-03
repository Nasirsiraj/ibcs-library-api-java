package titan.io.ibcslibraryapi.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import titan.io.ibcslibraryapi.repository.BookRepository;

@Slf4j
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
}
