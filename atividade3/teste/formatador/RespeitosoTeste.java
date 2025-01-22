package formatador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class RespeitosoTeste {

	@Test
    public void DeveRetornarComFormatoRespeitosoMasculino() {
        FormatadorNome formatoRespeitoso = new Respeitoso("masculino");
        Autoridade autoridade = new Autoridade("Jose", "Braga", formatoRespeitoso);
        
        String tratamento = autoridade.getTratamento();
        
        assertEquals("Sr. Braga", tratamento);
    }
	
	
	@Test
    public void DeveRetornarComFormatoRespeitosoFeminino() {
        FormatadorNome formatoRespeitoso = new Respeitoso("feminino");
        Autoridade autoridade = new Autoridade("Maria", "Braga", formatoRespeitoso);
        
        String tratamento = autoridade.getTratamento();
        
        assertEquals("Sra. Braga", tratamento);
    }
}
