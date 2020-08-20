package aula01.exercicio;

public class Retangulo {
    Double base, altura;

    public Double calcularArea(Double base, Double altura){
        return base * altura;
    }

    public Double calcularPerimetro(Double base, Double altura){
        return 2 * base + 2 * altura;
    }
}
