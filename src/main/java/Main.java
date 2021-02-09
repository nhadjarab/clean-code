
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    static int UserChoice;
    static Member member;
    static Librarian librarian;
    static Library library;
    static FileLibrary fl;

    public static void main(String[] args) {

        fl = new FileLibrary();
        List<Book> books = fl.LoadLibrary();
        library = new Library(books);
        System.out.println(library);


        scan = new Scanner(System.in);

        do{
            System.out.println("What role do you want ? ");
            System.out.println("1- Member");
            System.out.println("2- Librarian");
            System.out.println("0- Quit");

            UserChoice = scan.nextInt();

            switch (UserChoice){
                case 1:
                    displayMemberMenu();
                    break;
                case 2:
                    displayLibrarianMenu();
                    break;
                default:
            }
        }while (UserChoice != 0);
    }

    private static void displayLibrarianMenu() {

        do {

            System.out.println("1- show library content");
            System.out.println("2- add a book to library");
            System.out.println("3 - Save and go back to the previous menu");
            System.out.println("0- Quit");
            UserChoice = scan.nextInt();

            switch (UserChoice){
                case 1:
                    System.out.println(library);
                    break;
                case 2:
                    librarian = new Librarian();
                    System.out.print("enter the book's name : ");
                    String bookName = scan.next();
                    System.out.println("\nenter the book's author name :");
                    String authorName = scan.next();
                    System.out.println();
                    librarian.addBook(library, new Book(bookName, authorName));
                    break;
                case 3:
                    fl.storeLibrary(library);
                    return;
                default:
            }

        }while (UserChoice != 0);

    }

    private static void displayMemberMenu() {
        do {

            System.out.println("1- show library content");
            System.out.println("2- Borrow a book");
            System.out.println("3- Go back to the previous Menu");
            System.out.println("0- Quit");
            member = new Member();
            UserChoice = scan.nextInt();

            switch (UserChoice){
                case 1:
                    System.out.println(library);
                    break;
                case 2:
                    System.out.println("choose the book you want to borrow");
                    for (int i = 0; i< library.getListBooks().size(); i++){
                        System.out.println((i+1) + "- " + library.getListBooks().get(i).toString());
                    }
                    UserChoice = scan.nextInt();
                    System.out.println(library.getListBooks().get(UserChoice -1 ));
                    member.borrowBook(library.getListBooks().get(UserChoice - 1));
                    break;
                case 3:
                    return;
                default:
            }

        }while (UserChoice != 0);

    }
}
