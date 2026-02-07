public class SingletonPattern {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.executeQuery("SELECT * FROM users");

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.executeQuery("DELETE FROM logs");

        System.out.println(db1 == db2);

    }
}
class DatabaseConnection {
    //"volatile" ensures that changes made by one thread are immedietly visible to others
    private static volatile DatabaseConnection instance;

    //private constructor so that it cannot be accessible to outside of this class
    private DatabaseConnection() {
        System.out.println("connecting to database");
    }

    //Method is made public to enable accessibility outside of the class
    public static DatabaseConnection getInstance() {
        //1st Check: If it's already created, just return it (FAST)
        if(instance == null) {
            instance = new DatabaseConnection();
            synchronized (DatabaseConnection.class) {
                // 2nd Check: Double-check inside the lock to be sure
                // another thread didn't create it while we were waiting
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }

        //return the instance/object if created at the beginning or the same old object everytime any class creates it
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Executing " + query);
    }
}
