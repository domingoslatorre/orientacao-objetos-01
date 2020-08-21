package aula01.exercicio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {
    Correntista correntista;

    @BeforeEach
    public void beforeEach() {
        correntista = new Correntista(1, "João","joao@teste.com.br", 123456789);
    }

    @AfterEach
    public void afterEach() {
        correntista = null;
    }

    @Test
    public void criarObjeto() {
        assertNotNull(correntista);
    }

    @Test
    public void codigoExiste() {
        assertNotNull(correntista.getCodigo());
    }
    @Test
    public void nomeExiste() {
        assertNotNull(correntista.getNome());
    }
    @Test
    public void emailExiste() {
        assertNotNull(correntista.getEmail());
    }
    @Test
    public void telefoneExiste() {
        assertNotNull(correntista.getTelefone());
    }

}
