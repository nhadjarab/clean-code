public class Librarian extends Member {

    public Librarian(){
        nbUsers = getNbUsers() + 1;
        id = nbUsers;
    }

    public void addBook(Library library, Book book){
        library.getListBooks().add(book);
        System.out.println("book added successfully to library");
    }
}


