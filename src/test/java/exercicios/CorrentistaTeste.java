package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {

    @Test
    public void criarObjetoCorrentista() {
        Correntista c1 = new Correntista();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributos() {
        Correntista c1 = new Correntista();
        c1.codigo = 1;
        c1.nome = "João";
        c1.email = "joao@email.com";
        c1.telefone = "11111111";
        assertNotNull(c1.codigo);
        assertNotNull(c1.nome);
        assertNotNull(c1.email);
        assertNotNull(c1.telefone);
    }
}
