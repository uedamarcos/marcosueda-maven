import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptioinsTeste {
    @Test
    void validarAlgoSomenteUsuarioUeda(){
        Assumptions.assumeFalse("MARIA".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }
}
