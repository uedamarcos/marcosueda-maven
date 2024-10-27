import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.marcosueda.ApiDosCorreios;
import org.marcosueda.CadastrarPessoa2;
import org.marcosueda.DadosLocalizacao;
import org.marcosueda.Pessoa2;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoa2Teste {
    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa2 cadastrarPessoa2;

    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MT", "CUIABÁ", "ALAMEDA IPÊ BRANCO", "QUADRA 20 LOTE 8", "FLORAIS DOS LAGOS");
        Mockito.when(apiDosCorreios.buscarDadosComBaseNoCep("78049549")).thenReturn(dadosLocalizacao);
        Pessoa2 pessoa = cadastrarPessoa2.cadastrarPessoa2("Marcos","12345", LocalDate.now(),"78049549");
        assertEquals("Marcos",pessoa.getNome());
        assertEquals("12345",pessoa.getDocumento());
        assertEquals("MT",pessoa.getEndereco().getUf());
        assertEquals("QUADRA 20 LOTE 8",pessoa.getEndereco().getComplemento());
    }
}
