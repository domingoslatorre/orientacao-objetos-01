package exercicios;

public class Circulo {
    public Double raio;

    public Double calcularArea() {
        return Math.PI * raio * raio;
    }

    public Double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
