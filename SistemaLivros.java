public class SistemaLivros {

    public static void main(String[] args){

        Livros livro = new Livros();
        livro.setCodigo(1);
        livro.setTitulo("Código da Vinci"); 
        livro.setEditora("Editora XYZ");
        livro.setNrPaginas(100);
        livro.setEdicao(1);

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        /*Livro Biblioteca*/
        LivroBiblioteca livrobiblioteca = new LivroBiblioteca();

        livrobiblioteca.setCodigo(11);
        livrobiblioteca.setTitulo("Cinderela"); 
        livrobiblioteca.setAutor("Autor Desconhecido");
        livrobiblioteca.setEditora("Editora 123"); 
        livrobiblioteca.setNrPaginas(200);
        livrobiblioteca.setEdicao(6);
        livrobiblioteca.setLocalPrateleira("Prateleira AB2"); 
        livrobiblioteca.setCategoria("Animação"); 
        livrobiblioteca.setPrazoEntrega(10);
        livrobiblioteca.setNomeQuemEmprestou("Ana Julya");

        livrobiblioteca.Ler();
        livrobiblioteca.Cadastrar();
        livrobiblioteca.Localizar();
        livrobiblioteca.Alugar();
        livrobiblioteca.Devovler();

        LivroLivraria livrolivraria = new LivroLivraria();

        livrolivraria.setCodigo(21);
        livrolivraria.setTitulo("Cinderela");
        livrolivraria.setAutor("Autor Desconhecido");
        livrolivraria.setEditora("Editora 123");
        livrolivraria.setNrPaginas(200);
        livrolivraria.setEdicao(6);
        livrolivraria.setLocalPrateleira("Prateleira AB2"); 
        livrolivraria.setCategoria("Animação"); 
        livrolivraria.setPreco(10.99);
        livrolivraria.setNovoUsado("Usado");

        livrolivraria.Vender();

        System.out.println("Codigo do livro livraria: "+livrolivraria.getCodigo());
        System.out.println("Codigo do livro biblioteca: "+livrobiblioteca.getCodigo());
        System.out.println("Codigo do livro: "+livro.getCodigo());

    }
}