public class LivroLivraria extends Livros {

    private double preco;
    private String novoUsado;
    private String localPrateleira;
    private String categoria;

    public double getPreco(){ 
        return preco;
    }
    
    public void setPreco(double preco){ 
        this.preco = preco; 
    }

    public String getNovoUsado(){ 
        return novoUsado;
    }

    public void setNovoUsado(String novoUsado){ 
        this.novoUsado = novoUsado; 
    }

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

    public void Vender(){
        System.out.println("Estou vendendo...");
    }
}