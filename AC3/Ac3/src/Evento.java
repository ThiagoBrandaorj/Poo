public class Evento {
    String nome , data , local ;
     int n_max_part;
    private Aluno al;
    private Palestrante pa;
    
    Evento(String nome, String data , String local , int n_max_part){
        this.nome = nome;
        this.data = data;        
        this.local = local; 
        this.n_max_part = n_max_part;
    }
    void incluiAluno(Aluno al){
        this.al = al;
    }
    void incluiPalestrante(Palestrante pa){
        this.pa = pa;
    }
    void eExibeEvFut (String data){
        this.data = data;
    }
}
