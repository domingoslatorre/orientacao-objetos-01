package exemplos;

public class Retangulo {
    public Double base;
    public Double altura;

    public Double calcularArea(){
        return base * altura;
    }

    public Double calcularPerimetro(){
        return 2 * (base + altura);
    }
}