package exemplos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {

    @Test
    public void criarObjetoCirculo() {
        Circulo c1 = new Circulo();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributoRaio() {
        Circulo c1 = new Circulo();
        c1.raio = 10.0;
        assertNotNull(c1.raio);
    }

    @Test
    public void metodoCalcularArea() {
        Circulo q1 = new Circulo();
        q1.raio = 2.0;
        Double valorEsperado = 12.56;
        Double valorObtido = q1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        Circulo q1 = new Circulo();
        q1.raio = 2.0;
        Double valorEsperado = 12.56;
        Double valorObtido = q1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}
