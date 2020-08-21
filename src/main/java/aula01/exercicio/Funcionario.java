package aula01.exercicio;

public class Funcionario {

    public String nome;
    public String email;
    public Integer idade;
    public Double salario;

    Funcionario(){}

    Funcionario(String nome, String email, Integer idade, Double salario){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.salario = salario;
    }

    public String obterDados(){
        return nome + ", " + idade + " anos , " + email;
    }
    public void promover(Double porcentagemAumento){
        this.salario = this.salario * (1 + porcentagemAumento/100);
    }

}
