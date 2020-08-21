package aula02.exercicio;

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

    public void setBase(Double base) {
        this.base = base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
