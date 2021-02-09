import java.util.List;

public interface LibraryDAO {
    public List<Book> LoadLibrary();
    public boolean storeLibrary(Library library);
}
