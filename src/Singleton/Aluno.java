package Singleton;
import java.time.LocalDate;

public class Aluno {

    private String nome;
    private String matricula;
    private LocalDate dataDeNascimento;

    public Aluno(String nome, String matricula, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Aluno{nome='" + nome + "', matricula='" + matricula + "', nascimento=" + dataDeNascimento + "}";
    }
}
