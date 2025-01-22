package compras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {
    private List<String> ingredientes= new ArrayList<>();
    private static Map<String, Integer> ingredientesUtilizados = new HashMap<>();


    public void adicionaIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
        contaIngredientes(ingrediente);
    }

    
    public double getPreco() {
        int numIngredientes = ingredientes.size();
        
        if (numIngredientes <= 2) return 15.0;
        if (numIngredientes < 5) return 20.0;      
        return 23.0;
        }

    
    public List<String> getIngredientes() {
        return ingredientes;
    }

    
    private static void contaIngredientes(String ingrediente) {
        ingredientesUtilizados.put(ingrediente, ingredientesUtilizados.getOrDefault(ingrediente, 0) + 1);
    }

    
    public static Map<String, Integer> getIngredientesUtilizados() {
        return ingredientesUtilizados;
    }
    
    
    public static void zerarRegistro() {
        ingredientesUtilizados.clear();  
    }
}

