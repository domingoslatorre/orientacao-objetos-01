package aula02.exemplos;

public class Aluno {
    public String nome;
    public String sobrenome;
    public String telefone;

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }
}
