package Singleton;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Db {

    private List<Aluno> alunos = new ArrayList<>();

    public void addAluno(String nome, String matricula, LocalDate date){

        Aluno aluno = new Aluno(nome, matricula, date);
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }
}
