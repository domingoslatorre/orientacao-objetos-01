package exemplos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AlunoTeste {

    @Test
    public void criarObjetoAluno() {
        assertNotNull(new Aluno());
    }

}
