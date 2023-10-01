public class DbConnection {

    private int poolSize;

    private static volatile DbConnection connection;

    private DbConnection(int poolSize) {
        this.poolSize = poolSize;
    }

    public static DbConnection getConnection() {
        if (connection == null) {
            synchronized (DbConnection.class) {
                if (connection == null) {
                    connection = new DbConnection(10);
                }
            }
        }
        return connection;
    }

    public int getPoolSize() {
        return poolSize;
    }
}
