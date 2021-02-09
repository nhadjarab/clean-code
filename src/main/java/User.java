public abstract class User {
    protected static int nbUsers = 0;
    protected   int id = 0;

    protected static int getNbUsers() {
        return nbUsers;
    }
    public int getId() {
        return id;
    }
}
