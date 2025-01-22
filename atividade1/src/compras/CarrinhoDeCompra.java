package compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
	private List<Pizza> pizzas = new ArrayList<>();


    public void adicionaPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    
    public double calculaTotal() {
        double total = 0;
        
        for (Pizza pizza : pizzas) {
            total += pizza.getPreco();
        }   
        return total;
    }
}
