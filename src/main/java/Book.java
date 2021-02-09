public class Book {
    private final String title;
    private final String author;
    private boolean isBorrowed;
    private  int timeLeftToBeReturnedInDays;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        isBorrowed = false;
        timeLeftToBeReturnedInDays = 28;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public int getTimeLeftToBeReturnedInDays() {
        return timeLeftToBeReturnedInDays;
    }

    public void setTimeLeftToBeReturnedInDays(int timeLeftToBeReturnedInDays) {
        this.timeLeftToBeReturnedInDays = timeLeftToBeReturnedInDays;
    }

    @Override
    public String toString(){
        return title + ", " + author ;
    }
}
