package AdapterExercicio;

public class Aplication {

    private final Logger logger;

    public Aplication(Logger logger){
        this.logger = logger;
    }

    public Logger getLogger() {
        return logger;
    }

    public void run(){
        logger.info("Iniciando aplicacao");
        logger.error("Falha ao conectar ao banco de dados");
    }
}
