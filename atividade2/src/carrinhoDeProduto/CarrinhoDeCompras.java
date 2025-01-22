package carrinhoDeProduto;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	private HashMap<Produto, Integer> carrinhoCompra = new HashMap<>();


	public void adicionaProduto(Produto produto, int quantidade) {
		carrinhoCompra.put(produto, carrinhoCompra.getOrDefault(produto, 0) + quantidade);
	}
	
	 
	public void removeProduto(Produto produto, int quantidade) {
		if(!carrinhoCompra.containsKey(produto)) 
			throw new IllegalArgumentException("Produto não encontrado no carrinho");
		
		int novaQuantidade = carrinhoCompra.get(produto) - quantidade;
		
		if (novaQuantidade <= 0) {
	        carrinhoCompra.remove(produto);
	    } else {
	        carrinhoCompra.put(produto, novaQuantidade); 
	    }
	}	    	    	 	   

	
	public double calcularTotal() {
        double total = 0;
        for (Produto produto : carrinhoCompra.keySet()) {
            total += produto.preco * carrinhoCompra.get(produto);
        }
        return total;
    }
	

	public Map<Produto, Integer> getCarrinho() {
        return carrinhoCompra;
    }
	 
}