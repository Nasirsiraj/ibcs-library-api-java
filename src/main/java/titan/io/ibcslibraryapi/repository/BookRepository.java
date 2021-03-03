package titan.io.ibcslibraryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import titan.io.ibcslibraryapi.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
