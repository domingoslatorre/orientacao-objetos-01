package aula02.exercicio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTeste {

    Retangulo forma;

    @BeforeEach
    public void beforeEach(){
        forma = new Retangulo(3., 5.);
    }

    @AfterEach
    public void afterEach(){
        forma = null;
    }

    @Test
    public void criarObjeto(){
        assertNotNull(forma);
    }

    @Test
    public void baseExiste(){
        assertNotNull(forma.getBase());
    }

    @Test
    public void alturaExiste() {
        assertNotNull(forma.getAltura());
    }

    @Test
    public void calcularAreaTeste(){
        assertEquals(15., forma.calcularArea());
    }

    @Test
    public void calcularPerimetroTeste(){
        assertEquals(16., forma.calcularPerimetro());
    }
}
