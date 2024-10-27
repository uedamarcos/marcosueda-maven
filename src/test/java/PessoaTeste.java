import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.marcosueda.Pessoa;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTeste {
    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000,1,30, 15,0,0    ));
        Assertions.assertEquals(24,jessica.getIdade());
    }

    @Test
    void deveRetornarSeHeMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000,1,30, 15,0,0    ));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());
        Pessoa joao = new Pessoa("João", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());
    }
}
