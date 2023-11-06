package programa;

import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        File arquivo = new File("Alunos.txt");
        if (arquivo.exists() && !arquivo.isDirectory()){
            System.out.println("ja existe um arquivo Aluno.txt");
            System.out.println("será adionado ao conteúdo existente");
            
        }
        else{
            Gestor seletor = new Gestor("Alunos.txt");
            String opcao = "0";
            while (!opcao.equals("")) {
            seletor.exibeOpcoes();
            opcao = seletor.processaOpcoes();
        }
        }
    }

}
