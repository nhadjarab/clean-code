public class Guest extends User {

    public Guest(){
        User.nbUsers = User.getNbUsers() + 1;
        id = User.nbUsers;
    }

    public void readBook(Book book){
        System.out.println("user " + this.getId() + " is reading book " + book.getTitle() + " written by " + book.getAuthor());
    }
}
