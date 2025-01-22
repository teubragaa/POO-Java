package formatador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class InformalTest {

	@Test
    public void DeveVoltarTratamentoInformal() {
        FormatadorNome formatoInformal = new Informal();
        Autoridade autoridade = new Autoridade("Jose", "Braga", formatoInformal);
        
        String tratamento = autoridade.getTratamento();
        
        assertEquals("Jose", tratamento);
    }
}
