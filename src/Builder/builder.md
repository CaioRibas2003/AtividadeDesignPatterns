# Atividade Prática – Padrão Builder
## Cenário

Uma empresa deseja criar um sistema para montar **computadores personalizados**.

Cada computador pode possuir diferentes componentes, como:

- Processador
- Memória RAM
- Armazenamento
- Placa de vídeo
- Sistema operacional

Nem todos os computadores possuem todos os componentes.

### Computador básico
- Processador
- 8GB RAM
- 256GB SSD

### Computador gamer
- Processador
- 32GB RAM
- 1TB SSD
- Placa de vídeo

Para facilitar a construção desses objetos utilizaremos o **padrão Builder**.

## Requisitos
O projeto deve conter:

- Classe `Computador`
- Classe `ComputadorBuilder`
- Métodos de configuração
- Método `build()`
- Código de teste criando dois computadores

## Teste da implementação

Crie dois computadores diferentes:

### Computador básico

- Processador
- 8GB RAM
- 256GB SSD

### Computador gamer

- Processador
- 32GB RAM
- 1TB SSD
- Placa de vídeo

### Liste os dois computadores