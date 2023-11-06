package util;

import java.util.Scanner;

public class LeitoraDados {
    private Scanner sc;

    public LeitoraDados(){
        sc = new Scanner(System.in);
    }

    public String lerTexto(){
        return sc.nextLine();
    }

    public String[] lerNovoAluno(){
       System.out.print("Informe o nome do aluno: ");
       String nome = this.lerTexto();

       System.out.print("Informe o curso do aluno: ");
       String curso = this.lerTexto();

       System.out.print("Informe a matrícula do aluno: ");
       String matricula = this.lerTexto();

       return new String[] {matricula, curso, nome};
    }

    public String[] lerAlunoAlteracao(String matricula){
        System.out.print("Informe um novo nome: ");
        String nome = this.lerTexto();

        System.out.print("Informe um novo curso: ");
        String curso = this.lerTexto();

        return new String[] {matricula, curso, nome};
    }

    @Override
    protected void finalize(){
        sc.close();
    }
}
