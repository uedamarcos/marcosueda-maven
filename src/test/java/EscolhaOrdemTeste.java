import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhaOrdemTeste {
    @Order(4)
    @Test
    void validarFluxA(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validarFluxB(){
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validarFluxC(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validarFluxD(){
        Assertions.assertTrue(true);
    }
}
