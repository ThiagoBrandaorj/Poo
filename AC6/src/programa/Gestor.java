package programa;

import java.io.IOException;

import persistencia.AlunoDao;
import util.LeitoraDados;

public class Gestor {
    LeitoraDados leitoraDados;
    AlunoDao dao;

    public Gestor (String caminho) throws IOException{
        this.leitoraDados = new LeitoraDados();
        this.dao = new AlunoDao(caminho);
    }

    public void exibeOpcoes(){
        System.out.println("Selecione um número, ou aperte qualquer outro valor para sair:");
        System.out.println("1 - Cadastrar um Aluno;");
        System.out.println("2 - Atualizar os dados de um aluno;");
        System.out.println("3 - Remover um aluno;");
        System.out.println("4 - Pesquisar um aluno pela matricula;");
        System.out.println("5 - Exibir todos os alunos cadastrados;");
    }

    public String processaOpcoes() throws IOException {
        String opcao = this.leitoraDados.lerTexto();
        switch(opcao) {
            case "1":
                dao.adicionar(leitoraDados.lerNovoAluno());
                break;
            case "2":
                System.out.print("Digite a matricula do aluno a ser alterada: ");
                String matriculaAlterar = leitoraDados.lerTexto();
                if (dao.consultar(matriculaAlterar) != null) {
                    dao.alterar(leitoraDados.lerAlunoAlteracao(matriculaAlterar));
                } else {
                    System.out.println("A matricula inserida não foi localizada!");
                }
                break;
            case "3":
                System.out.print("Digite a matricula do aluno a ser excluído: ");
                String matriculaExcluir = leitoraDados.lerTexto();
                if (dao.consultar(matriculaExcluir) != null) {
                    dao.excluir(matriculaExcluir);
                    System.out.println("Aluno excluído com sucesso!");
                } else {
                    System.out.println("Matricula não encontrada!");
                }
                break;
            case "4":
                System.out.print("Digite a matricula do aluno: ");
                String matricula = leitoraDados.lerTexto();
                if (dao.consultar(matricula) != null) {
                    System.out.println(dao.consultar(matricula));
                } else {
                    System.out.println("Matricula não encontrada!");
                }
                break;
            case "5":
                System.out.println(dao);
                break;
            default:
                dao.exportar();
                System.out.println("Volte sempre!");
                opcao = "";
        }

        return opcao;
    }
}
