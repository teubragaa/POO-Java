package carrinhoDeProduto;

import java.util.Objects;

public class Produto {
    String nome;
    String codigo;
    double preco;

  
    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;       
        if(obj == null) throw new IllegalArgumentException("Objeto não pode ser null");
        
        Produto outro = (Produto) obj;
        return codigo.equals(outro.codigo);
    }
    

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
