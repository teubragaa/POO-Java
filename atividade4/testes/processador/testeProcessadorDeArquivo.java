package processador;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import org.junit.jupiter.api.Test;

public class testeProcessadorDeArquivo {
	
	@Test
    public void DeveProcessarArquivoComSucesso() throws LeituraArquivoException {
        String arquivo = "C:\\Users\\Braga\\Documents\\texto.txt";
               
        Map<String, String> resultado = ProcessadorArquivo.processar(arquivo);
        
        assertEquals("Jose", resultado.get("nome"));
        assertEquals("Braga", resultado.get("sobrenome"));
        assertEquals("35", resultado.get("idade"));
    }
	
	 
	@Test
    public void DeveProcessarLeituraArquivExceptionNaoEncontrado() {
        String arquivo = "inexistente.txt";

		 assertThrows(LeituraArquivoException.class, () -> 
	        ProcessadorArquivo.processar(arquivo)
	    );
	}
}
