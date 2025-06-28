package service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

public class BookServiceTest {

    @Test
    public void testGetNewBooksCount() {
        BookRepository mockRepo = mock(BookRepository.class);

        List<Book> newBooks = Arrays.asList(
            new Book("101", "Mockito Essentials"),
            new Book("102", "JUnit Testing")
        );
        when(mockRepo.findNewBooks()).thenReturn(newBooks);

        BookService service = new BookService(mockRepo);
        int count = service.getNewBooksCount();

        assertEquals(2, count);
    }
}
