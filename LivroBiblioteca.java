public class LivroBiblioteca extends Livros {

    //Atributos
    String localPrateleira;
    String categoria;
    int prazoEntrega;
    String nomeQuemEmprestou;

    //Metodos
    public void Alugar(){
        System.out.println("Estou alugando...");
    }

    public void Devovler(){
        System.out.println("Estou devolvendo...");
    }

}