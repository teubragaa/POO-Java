package carrinhoDeProduto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoDeComprasTest {
	
	
	@Test
    public void VerificaSeUmProdutoFoiAdicionadoCorretamenteAoCarrinho() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto produto = new Produto("Camiseta", "001", 39.90);
        
        carrinho.adicionaProduto(produto, 1);
        
        assertEquals(1, carrinho.getCarrinho().get(produto));
    }
	
	
	@Test
    public void VerificaSeRemoverProduto() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto produto = new Produto("Camiseta", "001", 39.90);

        carrinho.adicionaProduto(produto, 3); 
        carrinho.removeProduto(produto, 1); 

        assertEquals(2, carrinho.getCarrinho().get(produto));  
    }	
	
	@Test
    void VerificaSeProdutoFoiRemovidoDoCarrinhoQuandoZera() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Produto produto = new Produto("Camiseta", "001", 39.90);

        carrinho.adicionaProduto(produto, 3); 
        carrinho.removeProduto(produto, 1); 

        assertEquals(2, carrinho.getCarrinho().get(produto));

        carrinho.removeProduto(produto, 2);
        assertFalse(carrinho.getCarrinho().containsKey(produto));  
    }
}

