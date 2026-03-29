package AdapterExercicio;

public class LegacyLoggerAdapter implements Logger{

    private final LegacyLogger adapter;

    public void info(String mensagem){
        adapter.log("INFO" , mensagem);
    }

    public void error(String mensagem){
        adapter.log("ERROR" , mensagem);
    }

    public LegacyLoggerAdapter(LegacyLogger legado){

        this.adapter = legado;
    }
}
