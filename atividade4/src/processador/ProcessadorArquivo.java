package processador;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {
	
	public static Map<String, String> processar(String nomeArquivo) throws LeituraArquivoException {
        Map<String, String> resultado  = new HashMap<>();            
        File arquivo = new File(nomeArquivo);
        
        try (Scanner sc = new Scanner(arquivo)) {  
        	while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                String[] parte = linha.split("->");

                resultado.put(parte[0], parte[1]);
            }       	
        } catch (IOException e) {
            throw new LeituraArquivoException("Erro ao abrir o arquivo: " + e.getMessage());
        }   
        return resultado ;
    }
}