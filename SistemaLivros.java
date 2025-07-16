public class SistemaLivros {

    public static void main(String[] args){

        Livros livro = new Livros();
        livro.codigo = 1;
        livro.titulo = "Código da Vinci";
        livro.editora = "Editora XYZ";
        livro.nrPaginas = 100;
        livro.edicao = 3;

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        /*Livro Biblioteca*/
        LivroBiblioteca livrobiblioteca = new LivroBiblioteca();

        livrobiblioteca.codigo = 11;
        livrobiblioteca.titulo = "Cinderela";
        livrobiblioteca.autor = "Autor Desconhecido";
        livrobiblioteca.editora = "Editora 123"; 
        livrobiblioteca.nrPaginas = 200;
        livrobiblioteca.edicao = 6;
        livrobiblioteca.localPrateleira = "Prateleira AB2";
        livrobiblioteca.categoria = "Animação";
        livrobiblioteca.prazoEntrega = 10;
        livrobiblioteca.nomeQuemEmprestou = "Marcelo Petri";

        livrobiblioteca.Ler();
        livrobiblioteca.Cadastrar();
        livrobiblioteca.Localizar();
        livrobiblioteca.Alugar();
        livrobiblioteca.Devovler();

        LivroLivraria livrolivraria = new LivroLivraria();

        livrolivraria.codigo = 11;
        livrolivraria.titulo = "Cinderela";
        livrolivraria.autor = "Autor Desconhecido";
        livrolivraria.editora = "Editora 123"; 
        livrolivraria.nrPaginas = 200;
        livrolivraria.edicao = 6;
        livrolivraria.localPrateleira = "Prateleira AB2";
        livrolivraria.categoria = "Animação";
        livrolivraria.preco = 10;
        livrolivraria.novoUsado = "Usado";

        livrolivraria.Vender();

    }
}