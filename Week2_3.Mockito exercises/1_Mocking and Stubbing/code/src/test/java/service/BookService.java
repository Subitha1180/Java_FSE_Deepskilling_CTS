package service;

import java.util.List;

public class BookService {
    private BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public int getNewBooksCount() {
        return repository.findNewBooks().size();
    }
}
