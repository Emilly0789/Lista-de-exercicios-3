public class Turma {
    private Aluno[] alunos;

    public Turma(int quantidadeAlunos){
        alunos= new Aluno[quantidadeAlunos];
    }
    public void adicionarAluno(Aluno aluno, int indice){
        if(indice>=0 && indice<alunos.length){
            alunos[indice]=aluno;
        }
        else {
            System.out.println("Indice invalido");
        }
    }
    public void listarAprovados(){
        System.out.println("ALUNOS APROVADOS");
        for(Aluno aluno:alunos){
            if(aluno!= null && ! aluno.estaAprovado()){
                System.out.println(aluno.getNome() + " - Media: "+ aluno.calcularMedia());
            }
        }
    }

    public void listarReprovados() {
    }

}
