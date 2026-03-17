package Singleton;

public class Singleton {

    private static Singleton instancia;
    private Db db;


    private Singleton() {
        db = new Db();
    }

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public Db getDb() {
        return db;
    }
}
