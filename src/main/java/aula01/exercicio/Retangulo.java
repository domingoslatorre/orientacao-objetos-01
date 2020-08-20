package aula01.exercicio;

public class Retangulo {
    private Double base, altura;

    public Retangulo(){}

    public Retangulo(Double base, Double altura){
        this.base = base;
        this.altura = altura;
    }

    public Double calcularArea(){
        return base * altura;
    }

    public Double calcularPerimetro(){
        return 2 * base + 2 * altura;
    }

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }
}
