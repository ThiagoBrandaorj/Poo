package programa;
public class App {
    public static void main(String[] args) throws Exception {
        Gestor seletor = new Gestor("C:\\Users\\202301135265\\Documents\\Poo\\AC6\\out\\Alunos.txt");
        String opcao = "0";

        while (!opcao.equals("")) {
            seletor.exibeOpcoes();
            opcao = seletor.processaOpcoes();
        }
   }
}
