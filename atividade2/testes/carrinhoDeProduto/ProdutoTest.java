package carrinhoDeProduto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void VerificaSeDoisProdutosComMesmoCodigoSaoIguais() {
        Produto produto1 = new Produto("Camiseta", "001", 39.90);
        Produto produto2 = new Produto("Camiseta", "001", 39.90);
        
        assertTrue(produto1.equals(produto2));
    }

    @Test
    void VerificaSeDoisProdutosComCodigosDiferentesSaoDiferentes() {
        Produto produto1 = new Produto("Camiseta", "001", 39.90);
        Produto produto2 = new Produto("Calça", "002", 79.90);
        
        assertFalse(produto1.equals(produto2));
    }
}