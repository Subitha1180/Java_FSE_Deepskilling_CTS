package service;

import java.util.List;

public interface BookRepository {
    List<Book> findNewBooks();
}
