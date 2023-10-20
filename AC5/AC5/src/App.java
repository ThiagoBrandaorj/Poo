public class App {
    public static void main(String[] args) throws Exception {
        AlunoDAO alunos = new AlunoDAO();
        alunos.adicionar("202301135265", "Ciência de dados", "Thiago");
        alunos.adicionar("12345", "Eng de Soft", "João");
        alunos.adicionar("76800", "Ciência de dados", "Maria");

        alunos.remover("76800");
        alunos.atualizar("202301135265","Eng Mecânica");

        System.out.println(alunos.listarAluno("12345"));
        System.out.println("-------------------");

        alunos.listarAlunos();
    }

}
