package carrinhoDeProduto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ProdutoComTamanhoTest {

	@Test
    public void VerificaSeDoisProdutosComMesmoCodigoAndTamanhoSaoIguais() {
        ProdutoComTamanho produto1 = new ProdutoComTamanho("Camiseta", "001", 39.90, "M");
        ProdutoComTamanho produto2 = new ProdutoComTamanho("Camiseta", "001", 39.90, "M");
        
        assertTrue(produto1.equals(produto2));
    }
	
	@Test
    public void VerificaSeProdutosComCodigosDiferentesSaoDiferentes() {
        ProdutoComTamanho produto1 = new ProdutoComTamanho("Camiseta", "001", 39.90, "M");
        ProdutoComTamanho produto2 = new ProdutoComTamanho("Camiseta", "002", 39.90, "M");
        
        assertFalse(produto1.equals(produto2));
	} 
}
