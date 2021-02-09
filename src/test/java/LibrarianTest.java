import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LibrarianTest {
    Librarian librarian;
    Library library;

    @Before
    public void setup(){
        librarian = new Librarian();
        library = new Library();
    }

    @Test
    public void libraryBooksShouldBe_0(){
        assertTrue(library.getListBooks().size() == 0);
    }

    @Test
    public void libraryBooksShouldBe_1(){
        librarian.addBook(library, new Book("book test", "tester"));
        assertTrue(library.getListBooks().size() == 1);
    }

}
