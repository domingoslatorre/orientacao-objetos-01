package exercicios;

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
    public void presencaAtributos() {
        Circulo c1 = new Circulo();
        c1.raio = 10.0;
        assertNotNull(c1.raio);
    }

    // Exemplo de Dado/Quando/Então - Given/When/Then
    // Dado {uma condição}
    // Quando {faço alguma coisa}
    // Então {espero alguma resultado}

    @Test
    public void metodoCalcularArea() {
        // Dado que eu tenha um objeto do tipo Circulo com valor de raio igual a 10.0
        Circulo c1 = new Circulo();
        c1.raio = 10.0;

        // Quando eu chamo o método calcular área
        Double area = c1.calcularArea();

        // Então deve retornar o valor 314.1592653589793
        assertEquals(314.1592653589793, area);
    }

    @Test
    public void metodoCalcularPerimetro() {
        // Dado que eu tenha um objeto do tipo Circulo com valor de raio igual a 10
        Circulo c1 = new Circulo();
        c1.raio = 10.0;

        // Quando eu chamo o método calcular perimetro
        Double perimetro = c1.calcularPerimetro();

        // Então deve retornar o valor 62.83185307179586
        assertEquals(62.83185307179586, perimetro);
    }
}
