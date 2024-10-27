import org.junit.jupiter.api.*;
import org.marcosueda.BancoDados;
import org.marcosueda.Pessoa;


import java.security.KeyStore;
import java.time.LocalDateTime;


public class ConsultarDadosPessoaTest {
    @BeforeAll
    static void configurarConexao(){
        BancoDados.iniciarConexao();
        System.out.println("rodou configurarConexao");
    }
    @BeforeEach
    void inserirDadosParaTeste(){
        BancoDados.inserirDados(new Pessoa("João", LocalDateTime.of(2000,1,1,5,0,0) ));
    }

    @AfterEach
    void removerDadosTeste(){
        BancoDados.removerDados(new Pessoa("João", LocalDateTime.of(2000,1,1,5,0,0) ));

    }

    @Test
    void validarDadosRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosRetorno2(){
        Assertions.assertNull(null);
    }


    @AfterAll
    static void finalizarConexao(){

        BancoDados.finalizarConexao();
        System.out.println("rodou finalizarConexao");
    }


}
