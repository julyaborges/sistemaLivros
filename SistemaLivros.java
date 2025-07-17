public class SistemaLivros {

    public static void main(String[] args){

        Livros livro = new Livros(); //Método construtor
        livro.setCodigo(1);
        livro.setTitulo("Codigo da Vinci"); 
        livro.setAutor("Autor Desconhecido");
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
        livrobiblioteca.setCategoria("Animacao"); 
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
        livrolivraria.setCategoria("Animacao"); 
        livrolivraria.setPreco(10.99);
        livrolivraria.setNovoUsado("Usado");

        livrolivraria.Vender();

        System.out.println("Codigo do livro livraria: "+livrolivraria.getCodigo());
        System.out.println("Codigo do livro biblioteca: "+livrobiblioteca.getCodigo());
        System.out.println("Codigo do livro: "+livro.getCodigo());

        String mensagem = "\nCodigo: "+livro.getCodigo()+
                                "\nTitulo: "+livro.getTitulo()+
                                "\nAutor: "+livro.getAutor()+
                                "\nEditora: "+livro.getEditora()+
                                "\nNumero de paginas: "+livro.getNrPaginas()+
                                "\nEdicao: "+livro.getEdicao();
        
        System.out.println("\n\nLivro: "+mensagem);

        System.out.println("\n\nLivro Biblioteca: "+mensagem+
                            "\nLocal Prateleira: "+livrobiblioteca.getLocalPrateleira()+
                                "\nCategoria: "+livrobiblioteca.getCategoria()+
                                "\nPrazo de entrega: "+livrobiblioteca.getPrazoEntrega()+
                                "\nNome de quem Emprestou: "+livrobiblioteca.getNomeQuemEmprestou());    

        System.out.println("\n\nLivro Livraria: "+mensagem+
                            "\nPreco: "+livrolivraria.getPreco()+
                            "\nNovo ou Usado: "+livrolivraria.getNovoUsado()+
                            "\nLocal da prateleira: "+livrolivraria.getLocalPrateleira()+
                            "\nCategoria: "+livrolivraria.getCategoria());                 

        //Exemplo método construtor
        Livros novoLivro = new Livros();
        System.out.println("Novo Livro: "+novoLivro.getTitulo());
        novoLivro.setTitulo("Novo titulo legal");
        System.out.println("Novo Livro: "+novoLivro.getTitulo());
    }
}