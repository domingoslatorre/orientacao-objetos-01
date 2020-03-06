package exercicios;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FuncionarioTeste {

    @Test
    public void criarObjetoFuncionario() {
        Funcionario f1 = new Funcionario();
        assertNotNull(f1);
    }

    @Test
    public void presencaAtributos() {
        Funcionario f1 = new Funcionario();
        f1.nome = "João";
        f1.email = "joao@email.com";
        f1.idade = 33;
        f1.salario = 3000.0;
        assertNotNull(f1.nome);
        assertNotNull(f1.email);
        assertNotNull(f1.idade);
        assertNotNull(f1.salario);
    }

    // Exemplo de Dado/Quando/Então - Given/When/Then
    // Dado {uma condição}
    // Quando {faço alguma coisa}
    // Então {espero alguma resultado}

    // Valor válido 10%
    @Test
    public void metodoPromoverValor10() {
        // Dado que eu tenha um objeto Funcionario com salário de 3000.00
        Funcionario f1 = new Funcionario();
        f1.salario = 3000.0;

        // Quando eu chamo o método promover com 10% de porcentagem de aumento
        f1.promover(10.0);

        // Então o salário do funcionario deve ser 3300.00
        assertEquals(3300.0, f1.salario);
    }

    // Valor limite inferior 0% zero
    @Test
    public void metodoPromoverValor0() {
        // Dado que eu tenha um objeto Funcionario com salário de 3000.00
        Funcionario f1 = new Funcionario();
        f1.salario = 3000.0;

        // Quando eu chamo o método promover com 0% de porcentagem de aumento
        f1.promover(0.0);

        // Então o salário do funcionario deve ser 3000.00
        assertEquals(3000.0, f1.salario);
    }

    // Valor limite superior 100%
    @Test
    public void metodoPromoverValor100() {
        // Dado que eu tenha um objeto Funcionario com salário de 3000.00
        Funcionario f1 = new Funcionario();
        f1.salario = 3000.0;

        // Quando eu chamo o método promover com 100% de porcentagem de aumento
        f1.promover(100.0);

        // Então o salário do funcionario deve ser 6000.00
        assertEquals(6000.0, f1.salario);
    }

    // Valor inválido -10% - fora do limite
    @Test
    @Disabled
    public void metodoPromoverValorValorInvalido10Negativo() {
        // Dado que eu tenha um objeto Funcionario com salário de 3000.00
        Funcionario f1 = new Funcionario();
        f1.salario = 3000.0;

        // Quando eu chamo o método promover com -10% de porcentagem de aumento
        f1.promover(-10.0);

        // Então devo receber um exceção
        // Será implementado na próximas aulas com validação de parâmetros e exceptions
    }

    // Valor inválido 101% - fora do limite
    @Test
    @Disabled
    public void metodoPromoverValorValorInvalido101() {
        // Dado que eu tenha um objeto Funcionario com salário de 3000.00
        Funcionario f1 = new Funcionario();
        f1.salario = 3000.0;

        // Quando eu chamo o método promover com 101% de porcentagem de aumento
        f1.promover(101.0);

        // Então devo receber um exceção
        // Será implementado na próximas aulas com validação de parâmetros e exceptions
    }

    @Test
    public void metodoObterDados(){
        // Dado que eu tenha um objeto Funcionario com nome João, email joao@email.com e idade 33
        Funcionario f1 = new Funcionario();
        f1.nome = "João";
        f1.email = "joao@email.com";
        f1.idade = 33;

        // Quando eu chamo o método obter dados
        String valorObtido = f1.obterDados();

        // Então devo receber a string "João, 33 anos (joao@email.com)"
        assertEquals("João, 33 anos (joao@email.com)", valorObtido);
    }
}
