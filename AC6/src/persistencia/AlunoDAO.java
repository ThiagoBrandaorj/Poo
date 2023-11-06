package persistencia;
import entidades.Aluno;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import util.Arquivo;

public class AlunoDao {
    private List<Aluno> alunos = new ArrayList<>();
    private String caminho;

    public AlunoDao(String caminho) throws IOException {
        this.caminho = caminho;
        this.importar();
    }

    public void adicionar(String[] dadosAluno) {
        Aluno aluno = new Aluno(dadosAluno[0], dadosAluno[1], dadosAluno[2]);
        if (!this.alunos.contains(aluno)) {
            this.alunos.add(aluno);
        }
    }

    public void alterar(String[] dadosAluno) {
        Aluno aluno = new Aluno(dadosAluno[0], dadosAluno[1], dadosAluno[2]);
        int posicao = this.alunos.indexOf(aluno);
        this.alunos.set(posicao, aluno);
    }

    public void excluir(String matricula) {
        Aluno aluno = new Aluno(matricula);
        if (this.alunos.contains(aluno)) {
            this.alunos.remove(aluno);
        }
    }

    public Aluno consultar(String matricula) {
        Aluno alunoEncontrado = new Aluno(matricula);
        for (Aluno aluno : this.alunos) {
            if (aluno.equals(alunoEncontrado)) {
                return aluno;
            }
        }

        return null;
    }

    public List<Aluno> listar() {
        return Collections.unmodifiableList(this.alunos);
    }

    public void exportar() throws IOException {
        List<String> linhas = new ArrayList<>();

        for (Aluno aluno : this.listar()) {
            linhas.add(aluno.toString());
        }

        Arquivo.escrever(this.caminho, linhas);
    }

    public void importar() throws IOException {
        List<String> linhas = Arquivo.ler(this.caminho);

        for (String linha : linhas) {
            String[] dadosAluno = linha.split(" - ");
            this.adicionar(dadosAluno);
        }
    }

    @Override
    public String toString() {
        String msg = "";
        for (Aluno aluno : this.listar()) {
            msg += aluno + "\n";
        }
        return msg;
    }
}