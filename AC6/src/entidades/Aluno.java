package entidades;

import java.util.Objects;

public class Aluno {
    private String nome , curso , matricula;
    public Aluno(String matricula ,String curso, String nome){
            this.nome = nome;
            this.curso = curso;
            this.matricula = matricula;
    }

    public Aluno(String matricula){
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

    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Aluno)){
            return false;
        }
        Aluno aluno = (Aluno) obj;
        return aluno.matricula.equals(this.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, curso, nome);
    }

}

