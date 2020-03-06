package exercicios;

public class Funcionario {
    public String nome;
    public String email;
    public Integer idade;
    public Double salario;

    public String obterDados() {
        // Ou return String.format("%s, %d anos (%s)", nome, idade, email);
        return (nome + ", " + idade + " anos (" + email + ")");
    }

    public void promover(Double porcentagemAumento) {
        salario = salario + (salario * (porcentagemAumento / 100));
    }
}
