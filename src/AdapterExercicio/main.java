package AdapterExercicio;

public class main {
    public static void main(String[] args) {

        LegacyLogger legacy = new LegacyLogger();
        Logger logger = new LegacyLoggerAdapter(legacy);
        Aplication app = new Aplication(logger);
        app.run();
    }
}
