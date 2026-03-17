# Atividade Prática – Padrão Singleton
## Cenário
Um sistema precisa armazenar informações de alunos.

Para simplificar o desenvolvimento, o **banco de dados será representado por uma lista ou array em memória**.

Se cada parte do sistema criar seu próprio banco de dados, os dados podem ficar **separados e inconsistentes**.

Para resolver esse problema utilizaremos o **padrão Singleton**, garantindo que **existe apenas um banco de dados no sistema**.

## Requisitos
O projeto deve conter:

- Classe `BancoDeDados`
- Implementação do **padrão Singleton**
- Lista de alunos
- Método `adicionar_aluno`
- Método `listar_alunos`
- Código de teste demonstrando o funcionamento

## Class Main para Testes
No programa principal, crie duas variáveis utilizando o Singleton:
```
db1 = BancoDeDados.get_instance()
db2 = BancoDeDados.get_instance() 
```

Adicione alunos usando as duas variáveis:
```
db1.adicionar_aluno("Ana", 20)
db2.adicionar_aluno("Carlos", 22)
```

Depois liste os alunos:
```
db1.listar_alunos()
```

Verifique se as duas variáveis apontam para o mesmo objeto:
```
print(db1 is db2)
```