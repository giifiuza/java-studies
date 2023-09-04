package Aula2;

public class Main {
    public static void main(String[] args) {
//        Compra compra = new Compra();
//        compra.addItem(new Item("Coxinha", 5, 6.50));
//        compra.addItem(new Item("Suco de laranja", 4, 10));
//        System.out.println(compra.itens.size());
//        System.out.println(compra.obterValorTotal());

        Aluno aluno1 = new Aluno("Vampiro do mal");
        Aluno aluno2 = new Aluno("Vampiro do bem e ninguem gosta");
        Aluno aluno3 = new Aluno("Humana inutil que ninguem liga");

        Curso curso1 = new Curso("Como não ser um estripador");
        Curso curso2 = new Curso("Como não se apaixonar pela namorada do irmao");
        Curso curso3 = new Curso("Como parar de ser burra");

        curso1.addAluno(aluno2);
        curso2.addAluno(aluno2);

        curso2.addAluno(aluno1);
        curso3.addAluno(aluno3);

        aluno1.adicionarCurso(curso2);
        aluno1.adicionarCurso(curso1);
        aluno1.adicionarCurso(curso3);

        System.out.println(curso2.obterAlunos());
        System.out.println(aluno1.obterCursos());
    }
}
