package exemplos;

public class Circulo {
    public Double raio;

    public Double calcularArea() {
        return 3.14 * (raio * raio);
    }

    public Double calcularPerimetro() {
        return 2 * 3.14 * raio;
    }
}
