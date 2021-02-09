import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MemberTest {
    Member member;
    Book book;

    @Before
    public void setup(){
        member = new Member();
        book = new Book("book test", "tester");
        System.out.println("hello before");

    }

    @Test
    public void borrowBookTestShouldReturnTrue(){
        assertTrue(member.borrowBook(book));
    }


    @Test
    public void borrowBookTestShouldReturnFalse(){
        book.setBorrowed(true);
        assertFalse(member.borrowBook(book));
    }
}
