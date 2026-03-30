
## Contexto
Você está desenvolvendo um sistema de gerenciamento de arquivos e pastas. O sistema precisa permitir que pastas contenham tanto arquivos quanto outras pastas (estrutura hierárquica), 
e operações como calcular tamanho total, listar conteúdo e copiar devem funcionar de forma transparente.

## Instruções

### Parte 1: Criar a Interface Componente
1. Crie uma interface `FileSystemComponent` com métodos:
    - `getName(): String`
    - `getSize(): long` (em bytes)
    - `display(indentation: String): void` (para exibir a estrutura)
    - `add(component: FileSystemComponent): void` (pode ser vazio em folhas)
    - `remove(component: FileSystemComponent): void` (pode ser vazio em folhas)

### Parte 2: Implementar a Folha (Leaf)
1. Crie a classe `File` implementando `FileSystemComponent`:
    - Armazene nome e tamanho
    - `getSize()` retorna o tamanho do arquivo
    - `display()` mostra o arquivo com indentação
    - `add()` e `remove()` lançam exceção (arquivo não pode conter componentes)

### Parte 3: Implementar o Composite
1. Crie a classe `Directory` implementando `FileSystemComponent`:
    - Armazene um nome e uma lista de componentes
    - `add()` adiciona um componente à lista
    - `remove()` remove um componente da lista
    - `getSize()` retorna a soma de tamanho de todos os componentes (recursivo!)
    - `display()` mostra a pasta e todos seus componentes com indentação apropriada

### Parte 4: Utilizar o Pattern
1. Construa uma estrutura hierárquica de exemplo:
```
root/
├── docs/
│   ├── projeto.pdf (2MB)
│   └── relatorio.docx (1MB)
├── fotos/
│   ├── vacacao.jpg (3MB)
│   └── familia/
│       ├── casal.jpg (2MB)
│       └── filhos.jpg (1MB)
└── readme.txt (0.5MB)
```

2. Teste as operações:
    - Exiba toda a estrutura com `display()`
    - Calcule o tamanho total da pasta root
    - Calcule o tamanho de subpastas específicas

## Requisitos
- Criar uma estrutura em árvore
- Operações funcionam de forma uniforme em folhas e compostos
- Recursão transparente ao cliente
- Fácil adicionar novos componentes

## Exemplo de Saída Esperada
```
root/
├─ docs/
│  ├─ projeto.pdf (2.0 MB)
│  └─ relatorio.docx (1.0 MB)
├─ fotos/
│  ├─ vacacao.jpg (3.0 MB)
│  └─ familia/
│     ├─ casal.jpg (2.0 MB)
│     └─ filhos.jpg (1.0 MB)
└─ readme.txt (0.5 MB)

Tamanho total: 9.5 MB
Tamanho da pasta 'docs': 3.0 MB
Tamanho da pasta 'familia': 3.0 MB
```
atividade_composite.md
Exibindo atividade_composite.md…