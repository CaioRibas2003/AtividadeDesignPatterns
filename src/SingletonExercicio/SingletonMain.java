package SingletonExercicio;
import java.time.LocalDate;


public class SingletonMain {
    public static void main(String[] args) {

    Db dataBase = Singleton.getInstancia().getDb();
    Db dataBase2 = Singleton.getInstancia().getDb();

    dataBase.addAluno("Joao", "A2456PW", LocalDate.of(2002,2,13));
    dataBase.addAluno("Maria", "A2478UZ", LocalDate.of(2000,5,21));

    dataBase2.getAlunos().forEach(aluno -> System.out.println(aluno));

    }
}
