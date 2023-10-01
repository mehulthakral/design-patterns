public class Main {
    public static void main(String[] args) {

        DbConnection dbConnection = DbConnection.getConnection();
        System.out.println(dbConnection.getPoolSize());
    }

}
