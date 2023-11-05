package programa;
import persistencia.AlunoDAO;

public class App {
    public static void main(String[] args) throws Exception {
        AlunoDAO alunos = new AlunoDAO();
        alunos.adicionar("202301135265", "Ciência de dados", "Thiago");
        alunos.adicionar("12345", "Eng de Soft", "João");
        alunos.adicionar("76800", "Ciência de dados", "Maria");
        alunos.adicionar("236483973", "Econômia", "Breno");
        alunos.adicionar("2021", "Eng de Produção", "Miguel");
        alunos.adicionar("2022", "Publicidade", "Alice");
        
    }

}
