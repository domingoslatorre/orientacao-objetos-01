package aula01.exercicio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FuncionarioTeste {

    Funcionario funcionario;

    @BeforeEach
    public void beforeEach(){
        funcionario = new Funcionario("João da Silva", "joao@email.com",22, 3000. );
    }

    @AfterEach
    public void aftterEach(){
        funcionario = null;
    }

    @Test
    public void criarObjeto(){
        assertNotNull(funcionario);
    }

    @Test
    public void nomeExiste(){
        assertNotNull(funcionario.nome);
    }

    @Test
    public void emailExiste(){
        assertNotNull(funcionario.email);
    }

    @Test
    public void idadeExiste(){
        assertNotNull(funcionario.idade);
    }

    @Test
    public void salarioExiste(){
        assertNotNull(funcionario.salario);
    }

    @Test
    public void obterDados(){
        assertEquals("João da Silva, 22 anos , joao@email.com", funcionario.obterDados());
    }

    @Test
    public void promover(){
        funcionario.promover(10.);

        assertEquals(3300.0000000000005, funcionario.salario);
    }

}
