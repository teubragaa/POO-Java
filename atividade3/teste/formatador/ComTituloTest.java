package formatador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComTituloTest {

	@Test
    public void testAutoridadeComFormatoComTitulo() {
        FormatadorNome formatoComTitulo = new ComTitulo("Magnífico");
        Autoridade autoridade = new Autoridade("Jose", "Braga", formatoComTitulo);
        
        String tratamento = autoridade.getTratamento();
        
        assertEquals("Magnífico Jose Braga", tratamento);
    }
}
