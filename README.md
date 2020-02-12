# Introdução a Orientação a Objetos

## Instruções

### Executar o projeto

No Linux
```bash
./gradlew run
```

No Windows
```bash
gradlew.bat run
```

### Rodar os testes

No Linux
```bash
./gradlew test --rerun-tasks
```

No Windows
```bash
gradlew.bat test --rerun-tasks
```

## Exemplos

### Classes, membros, objetos, diagrama de classes e objetos

Classe Aluno
```java
package exemplos;

public class Aluno {
   
}
```

Atributos da classe Aluno
```java
package exemplos;

public class Aluno {
    public String nome;
    public String sobrenome;
    public String telefone;
    
}
```

Método Main (ponto de início de execução programa)
```java
import exemplos.Aluno;

public class Main {
    public static void main(String[] args) {
        
    }
}
```


Criação de dois objetos Aluno e definição de valores para os atributos
```java
import exemplos.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "João";
        a1.sobrenome = "da Silva";
        a1.telefone = "11-1111111";

        Aluno a2 = new Aluno();
        a2.nome = "Maria";
        a2.sobrenome = "do Santos";
        a2.telefone = "12-121212";
    }
}
```

Mostra na saída os valores dos atributos de cada aluno
```java
import exemplos.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "João";
        a1.sobrenome = "da Silva";
        a1.telefone = "11-1111111";

        Aluno a2 = new Aluno();
        a2.nome = "Maria";
        a2.sobrenome = "do Santos";
        a2.telefone = "12-121212";

        System.out.println(a1.nome);
        System.out.println(a1.sobrenome);
        System.out.println(a1.nome + " " + a1.sobrenome);

        System.out.println(a2.nome);
        System.out.println(a2.sobrenome);
        System.out.println(a2.nome + " " + a2.sobrenome);
    }
}
```

Métodos para obter o nome completo de um aluno
```java
package exemplos;

public class Aluno {
    public String nome;
    public String sobrenome;
    public String telefone;

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }
}
```

Chamando o método obter nome no Main
```java
import exemplos.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "João";
        a1.sobrenome = "da Silva";
        a1.telefone = "11-1111111";

        Aluno a2 = new Aluno();
        a2.nome = "Maria";
        a2.sobrenome = "do Santos";
        a2.telefone = "12-121212";

        System.out.println(a1.nome);
        System.out.println(a1.sobrenome);
        //System.out.println(a1.nome + " " + a1.sobrenome);
        System.out.println(a1.getNomeCompleto());
        
        System.out.println(a2.nome);
        System.out.println(a2.sobrenome);
        //System.out.println(a2.nome + " " + a2.sobrenome);
        System.out.println(a2.getNomeCompleto());
    }
}
```

Diagrama de Classe de Aluno
![Image of Yaktocat](arquivos/exemplo01.png)

```java
public class Aluno {
    public String nome;
    public String sobrenome;
    public String telefone;

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }
}
```

Diagrama de Objetos da classe Aluno no momento da execução do método Main
![Image of Yaktocat](arquivos/exemplo02.png)

```java
public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "João";
        a1.sobrenome = "da Silva";
        a1.telefone = "11-1111111";

        Aluno a2 = new Aluno();
        a2.nome = "Maria";
        a2.sobrenome = "do Santos";
        a2.telefone = "12-121212";
        
    }
}
```

### Abstração de Procedimentos vs. A