import exemplos.Aluno;
import exemplos.Quadrado;

public class Main {
    public static void main(String[] args) {
        // Exemplo errado de teste
        Quadrado q1 = new Quadrado();
        q1.lado = 10.0;

        System.out.println(q1.calcularArea());
        System.out.println(q1.calcularPerimetro());

    }

}
