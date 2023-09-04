public class LivroFisico{
       public boolean reservado, emprestado;
       public String nome , autor;

       public LivroFisico(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
        this.reservado = false;
        this.emprestado = false;
    }

    public void emprestar(){
       if (reservado && !emprestado){
              emprestado = true;
              System.out.println("O livro foi emprestado");
       }
       else if (!reservado){
              System.out.println("O livro precisa ser reservado primeiro");
       }
       else{
              System.out.println("O livro já está emprestado");

       }
       }

       public void reservar(){
              if (!reservado){
                     reservado = true;
                     System.out.println("O livro foi reservado");
              }
              else{
                     System.out.println("O livro já está reservado");
              }
       }

       public void cancelarReserva(){
        if (reservado){
              reservado = false;
              System.out.println("A reserva do livro foi cancelada");
        }
       else{
              System.out.println("O livro não está reservado");
       }
       }

       public void devolver(){
        if (emprestado){
              emprestado = false;
              System.out.println("O livro foi devolvido com sucesso");
        }
        else{
              System.out.println("O livro não está emprestado");
        }
       }


}
