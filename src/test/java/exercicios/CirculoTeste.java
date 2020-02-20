package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {

    @Test
    public void criarObjCirculo(){
        Circulo c1 = new Circulo();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributos(){
        Circulo c1 = new Circulo();
        c1.raio = 10.0;
        assertNotNull(c1.raio);
    }

    @Test
    public void metodoCalcularArea(){
        Circulo c1 = new Circulo();
        c1.raio = 10.0;
        double valorEsperado = 314.1592653589793;

        double valorObtido = c1.calcularArea();

        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    public void metodoCalcularPerimetro(){
     Circulo c1 = new Circulo();
     c1.raio = 20.0;
     double valorEsperado = 125.663706143591729591;

     double valorObtido = c1.calcularPerimetro();

     assertEquals(valorEsperado, valorObtido);
    }
}
