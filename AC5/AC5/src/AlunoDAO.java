import java.util.LinkedList;

public class AlunoDAO {
    LinkedList<Aluno> alunos = new LinkedList<>();
    AlunoDAO() {
        alunos = new LinkedList<Aluno>();
    }

   public void setAlunos(LinkedList<Aluno> alunos) {
       this.alunos = alunos;
   }

    public LinkedList<Aluno> getAlunos() {
        return alunos;
    }
    
    public void adicionar(String matricula , String curso , String nome) {
        this.alunos.add(new Aluno(matricula, curso, nome));
    }

    public void remover(String matricula){
        for(Aluno str : alunos){
            if (str.equals(matricula)){
                alunos.remove();
            }
        };
    }

    public void atualizar(String matricula, String novoCurso){
        for(Aluno str : alunos){
            if (str.equals(matricula)){
                str.setCurso(novoCurso);
            }
        }
    }

    public void listaraluno(String matricula){
        for(Aluno str : alunos){
            if (str.equals(matricula)){
                alunos.element();
            }
    }}
}
