public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;

    public Aluno (String nome, int matricula){
        this.nome=nome;
        this.matricula=matricula;
        this.notas=new double[4];
    }

    public void cadastrarNota(int indice,double nota){
        if(indice>=0 && indice<4){
            notas[indice]=nota;
        }
        else{
            System.out.println("Indice invalido");
        }
    }

    public double calcularMedia(){
        double soma=0;
        for(double nota: notas){
            soma+=nota;
        }
        return soma/notas.length;
    }

    public boolean estaAprovado(){
        return calcularMedia() >=7.0;
    }

    public String getNome(){
        return nome;
    }
    public int getMatricula(){
        return matricula;
    }


}

