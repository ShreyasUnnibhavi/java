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
    
    private DatabaseConnection() {}

    private static class InstanceHolder {
        private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    }

    public static DatabaseConnection getInstance(){
        return InstanceHolder.INSTANCE;
    }

    public void executeQuery(String query) {
        System.out.println("Executing " + query);
    }
}
