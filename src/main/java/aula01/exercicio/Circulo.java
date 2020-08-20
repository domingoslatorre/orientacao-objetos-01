package aula01.exercicio;

public class Circulo {
    Double raio;

    public Double calcularArea(Double raio){
        return Math.PI * raio * raio;
    }

    public Double calcularPerimetro(Double raio){
        return 2 * Math.PI * raio;
    }
}
