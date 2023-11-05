
import java.util.LinkedList;

public class AlunoDAO {
    LinkedList<Aluno> alunos = new LinkedList<>();
    AlunoDAO() {
        alunos = new LinkedList<Aluno>();
    }

   public void setAlunos(LinkedList<Aluno> alunos) {
       this.alunos = new LinkedList<Aluno>();
    }

    public LinkedList<Aluno> getAlunos() {
        return alunos;
    }
    
    public void adicionar(String matricula , String curso , String nome) {
        this.alunos.add(new Aluno(matricula, curso, nome));
    }

    public void remover(String matricula){
        for(Aluno str : alunos){
            if (str.getMatricula().equals(matricula)){
                alunos.remove(str);
            }
        };
    }

    public void atualizar(String matricula, String novoCurso){
        for(Aluno str : alunos){
            if (str.getMatricula().equals(matricula)){
                str.setCurso(novoCurso);
            }
        }
    }

    public Aluno listarAluno(String matricula){
        for(Aluno str : this.alunos){
            if (str.getMatricula().equals(matricula)){
                return str;
            }
        }

        return null;
    }

    public String listarAlunos(){
        String acumulado = "";
        for(Aluno str : this.alunos){
            acumulado += str + " " + "\n";
        }
        return acumulado;
    }

    @Override
    public String toString() {
        return "";
    }

}

