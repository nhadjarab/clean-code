public class Member extends Guest {

    public Member(){
       super();
    }

    public boolean borrowBook(Book book){
        if (book == null){
            return false;
        }
        if (! book.isBorrowed()){
            book.setBorrowed(true);
            book.setTimeLeftToBeReturnedInDays(28);
            System.out.println("Book borrowed successfully");
            return true;
        }
        System.out.println("Book not available, already borrowed");
        return false;
    }

}
