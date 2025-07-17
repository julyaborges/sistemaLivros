public class Livros {

    //Atributos
    private int codigo;
    private String titulo;
    private String autor;
    private String editora;
    private int nrPaginas;
    private int edicao;

    //Método construtor (serve para construir seu objeto com valores default)
    Livros(){
        this.codigo = 0;
        this.titulo = "Nenhum Titulo";
        this.autor = "";
        this.editora = "";
        this.nrPaginas = 0;
        this.edicao = 0;
    }

    //Metodos
    public int getCodigo(){ //Método de acesso para um atributo que é privado
        return codigo;
    } 

    public void setCodigo(int codigo){ //Método que envia um valor para um atributo privado 
        this.codigo = codigo; 
    }

    public String getTitulo(){ 
        return titulo;
    }

    public void setTitulo(String titulo){ 
        this.titulo = titulo; 
    }

    public String getAutor(){ 
        return autor;
    }

    public void setAutor(String autor){ 
        this.autor = autor; 
    }

    public String getEditora(){ 
        return editora;
    }

    public void setEditora(String editora){ 
        this.editora = editora; 
    }

    public int getNrPaginas(){ 
        return nrPaginas;
    }

    public void setNrPaginas(int nrPaginas){ 
        this.nrPaginas = nrPaginas; 
    }

    public int getEdicao(){ 
        return edicao;
    }

    public void setEdicao(int edicao){ 
        this.edicao = edicao; 
    } 

    public void Ler(){
        System.out.println("Estou lendo...");
    }

    public void Cadastrar(){
        System.out.println("Estou cadastrando...");        
    }

    public void Localizar(){
        System.out.println("Estou localizando...");        
    }

    


}