public class Aluno {
    public String nome , curso , matricula;
    Aluno(String matricula ,String curso, String nome){
            this.nome = nome;
            this.curso = curso;
            this.matricula = matricula;
    }

    public void setAlunos(String nome) {
        this.nome = nome;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome(){
        return nome;
    }
    public String getCurso() {
        return curso;
    }
    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return matricula + " / " + nome + " / " + curso;
    }
}

