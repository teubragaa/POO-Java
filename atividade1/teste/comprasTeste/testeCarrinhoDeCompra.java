package comprasTeste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import compras.Pizza;

class testeCarrinhoDeCompra {
	
	private Pizza pizza;
	
	
	@BeforeEach
	void Inicializar() {
		pizza = new Pizza();
		Pizza.zerarRegistro();
	}
	
	
	@Test
	void TestarPrecoPizzaComDoisIngredientes() {
		pizza.adicionaIngrediente("queijo");		
		pizza.adicionaIngrediente("tomate");
		
		assertEquals(15.00, pizza.getPreco());
	}
	
	
	@Test
	void TestarPrecoPizzaComTresIngredientes() {
		pizza.adicionaIngrediente("queijo");		
		pizza.adicionaIngrediente("tomate");
		pizza.adicionaIngrediente("frango");			

		assertEquals(20.00, pizza.getPreco());
	}
	
	
	@Test
	void TestarPrecoPizzaComCincoIngredientes() {
		pizza.adicionaIngrediente("queijo");		
		pizza.adicionaIngrediente("tomate");
		pizza.adicionaIngrediente("frango");		
		pizza.adicionaIngrediente("presunto");		
		pizza.adicionaIngrediente("queijo");		


		assertEquals(23.00, pizza.getPreco());
	}
	
	
	@Test
	void TestarRegistroDeIngredientes() {
		pizza.adicionaIngrediente("queijo");		
		pizza.adicionaIngrediente("frango");

		assertEquals(1, pizza.getIngredientesUtilizados().get("queijo"));
		assertEquals(1, pizza.getIngredientesUtilizados().get("frango"));
	}
	
	
	@Test
	void TestarRegistroDeMesmoIngrediente() {
		Pizza pizza = new Pizza();
		pizza.adicionaIngrediente("queijo");		
		pizza.adicionaIngrediente("queijo");

		assertEquals(2, pizza.getIngredientesUtilizados().get("queijo"));
	}
}