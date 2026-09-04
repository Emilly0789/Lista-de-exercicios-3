public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", 1);

        aluno1.cadastrarNota(0, 8);
        aluno1.cadastrarNota(1, 7);
        aluno1.cadastrarNota(2, 9);
        aluno1.cadastrarNota(3, 8);


        Aluno aluno2 = new Aluno("Maria", 2);

        aluno2.cadastrarNota(0, 5);
        aluno2.cadastrarNota(1, 6);
        aluno2.cadastrarNota(2, 4);
        aluno2.cadastrarNota(3, 5);


        Aluno aluno3 = new Aluno("Pedro", 3);

        aluno3.cadastrarNota(0, 10);
        aluno3.cadastrarNota(1, 9);
        aluno3.cadastrarNota(2, 8);
        aluno3.cadastrarNota(3, 9);


        Turma turma = new Turma(3);

        turma.adicionarAluno(aluno1, 0);
        turma.adicionarAluno(aluno2, 1);
        turma.adicionarAluno(aluno3, 2);


        turma.listarAprovados();

        System.out.println();

        turma.listarReprovados();
    }
}
