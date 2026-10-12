package servico;

import org.junit.Test;
import static org.junit.Assert.*;

public class ViagemServiceTest {

    @Test
    public void testCadastrarViagemNula() throws Exception {

        ViagemService service = new ViagemService(null);

        try {
            service.cadastrar(null);
            fail("Era esperado um erro para viagem nula.");
        } catch (IllegalArgumentException e) {
            assertEquals("Viagem inválida.", e.getMessage());
        }
    }
}