package Aula2;

import java.util.ArrayList;

public class Curso {
    String nome;
    ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    void addAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    ArrayList<String> obterAlunos(){
        ArrayList<String> cadastrados = new ArrayList<>();
        for (Aluno aluno:alunos) {
            cadastrados.add(aluno.nome);
        }
        return cadastrados;
    }
}
