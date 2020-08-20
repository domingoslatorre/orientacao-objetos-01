package aula01.exercicio;

public class Circulo {
    Double raio;

    public Double calcularArea(){
        return Math.PI * raio * raio;
    }

    public Double calcularPerimetro(){
        return 2 * Math.PI * raio;
    }
}
