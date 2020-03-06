package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTeste {

    @Test
    public void criarObjetoRetangulo() {
        Retangulo r1 = new Retangulo();
        assertNotNull(r1);
    }

    @Test
    public void presencaAtributos() {
        Retangulo r1 = new Retangulo();
        r1.base = 10.0;
        r1.altura = 20.0;
        assertNotNull(r1.base);
        assertNotNull(r1.altura);
    }

    @Test
    public void metodoCalcularArea() {
        // Arrange
        Retangulo r1 = new Retangulo();
        r1.base = 10.0;
        r1.altura = 20.0;
        Double valorEsperado = 200.0;

        // Act
        Double valorObtido = r1.calcularArea();

        // Assert
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro() {
        // Arrange
        Retangulo r1 = new Retangulo();
        r1.base = 10.0;
        r1.altura = 20.0;
        Double valorEsperado = 60.0;
        // Act
        Double valorObtido = r1.calcularPerimetro();
        // Assert
        assertEquals(valorEsperado, valorObtido);
    }
}
