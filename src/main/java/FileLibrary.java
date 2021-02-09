import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileLibrary implements LibraryDAO {
    private final String PATH_TO_FILE = "library.txt" ;
    private final String FILE_SEPARATOR = "," ;


    @Override
    public List<Book> LoadLibrary() {
        List<Book> books = new ArrayList<>();
        try {
            File myObj = new File(PATH_TO_FILE);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] data = line.split(FILE_SEPARATOR);
                Book book = new Book(data[0], data[1]);
                books.add(book);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return books;
    }


    @Override
    public boolean storeLibrary(Library library) {
        FileWriter os = null;
        try {
            os = new FileWriter(PATH_TO_FILE);
            os.write(library.toString());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }finally{
            try {
                if (os != null)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
