package carrinhoDeProduto;

import java.util.Objects;

public class ProdutoComTamanho extends Produto {
    String tamanho;

    public ProdutoComTamanho(String nome, String codigo, double preco, String tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    
    @Override
    public boolean equals(Object obj) {
    	if (obj == this) return true;
        if (obj == null) throw new IllegalArgumentException("Objeto não pode ser null");
                
        ProdutoComTamanho outro = (ProdutoComTamanho) obj;
        return codigo.equals(outro.codigo) && tamanho.equals(outro.tamanho);
    }
    

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tamanho);
    }
}
