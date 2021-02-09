import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> listBooks;

    public List<Book> getListBooks() {
        return listBooks;
    }

    public Library(){
        listBooks = new ArrayList<Book>();
    }

    public Library(List<Book> books){
        listBooks = new ArrayList<Book>();
        for (Book book: books){
            listBooks.add(book);
        }
    }

    @Override
    public String toString(){
        String libraryDescription = "";

        for (Book book: listBooks)
            libraryDescription += book.toString() + "\n";

        return libraryDescription;
    }
}
