public class LivroBiblioteca extends Livros {

    //Atributos
    private String localPrateleira;
    private String categoria;
    private int prazoEntrega;
    private String nomeQuemEmprestou;

    //Metodos
    public String getLocalPrateleira(){ 
        return localPrateleira;
    }
    
    public void setLocalPrateleira(String localPrateleira){ 
        this.localPrateleira = localPrateleira; 
    }

    public String getCategoria(){ 
        return categoria;
    }

    public void setCategoria(String categoria){ 
        this.categoria = categoria; 
    }
    
    public int getPrazoEntrega(){ 
        return prazoEntrega;
    }

    public void setPrazoEntrega(int prazoEntrega){ 
        this.prazoEntrega = prazoEntrega; 
    }

    public String getNomeQuemEmprestou(){ 
        return nomeQuemEmprestou;
    }

    public void setNomeQuemEmprestou(String nomeQuemEmprestou){ 
        this.nomeQuemEmprestou = nomeQuemEmprestou; 
    }

    public void Alugar(){
        System.out.println("Estou alugando...");
    }

    public void Devovler(){
        System.out.println("Estou devolvendo...");
    }

}