package aula01.exercicio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {

    Circulo forma;

    @BeforeEach
    public void beforeEach() {
        forma = new Circulo(3.);
    }

    @AfterEach
    public void afterEach() {
        forma = null;
    }

    @Test
    public void criarObjeto() {
        assertNotNull(forma);
    }

    @Test
    public void raioExiste() {
        assertNotNull(forma.getRaio());
    }

    @Test
    public void calcularAreaTeste() {
        DecimalFormat format = new DecimalFormat("#.0000");
        assertEquals("28,2743", format.format(forma.calcularArea()));
    }

    @Test
    public void calcularPerimetroTeste() {
        Double control = 3 * 2 * Math.PI;
        assertEquals(control, forma.calcularPerimetro());
    }
}
