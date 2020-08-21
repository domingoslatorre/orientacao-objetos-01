package aula02.exercicio;

public class Correntista {

    private Integer codigo;
    private String nome;
    private String email;
    private Integer telefone;

    Correntista(){}
    Correntista(Integer codigo, String nome, String email, Integer telefone){
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Integer getTelefone() {
        return telefone;
    }
}
