# Exercício: Adapter (Java) — Sistema de Logs com Biblioteca Legada

## Contexto
Você está desenvolvendo uma aplicação que padroniza logs com métodos específicos (`info`, `error`).  
Porém, a empresa já possui uma biblioteca antiga (legada) para logs, que não pode ser alterada.

- O sistema **novo** espera a interface: `Logger`
- A biblioteca **legada** oferece: `LegacyLogger`

Sua missão é criar um **Adapter** para que o sistema novo funcione usando a biblioteca legada internamente, sem que o código cliente precise conhecer o legado.

---

## Regras do exercício
- **Não pode modificar** a classe `LegacyLogger`.
- O código cliente (classe `Application`) deve depender apenas de `Logger` (interface).
- O Adapter deve converter as chamadas de `Logger` para `LegacyLogger`.

---

## Parte A — Criar os contratos

### 1) Interface do sistema novo (Target)
Crie a interface `Logger` com os métodos:
- `void info(String message);`
- `void error(String message);`

### 2) Classe legada (Adaptee)
Crie a classe `LegacyLogger` com o método:
- `void log(String level, String text);`

Este método deve imprimir no console algo no formato:
- `[LEVEL] text`

Exemplo:
- `[INFO] Iniciando aplicação`

> Observação: no mundo real, essa classe viria pronta de outra biblioteca. Aqui você vai implementá-la apenas para simular o legado, mas **não deve alterá-la depois**.

---

## Parte B — Criar o Adapter

### 3) Adapter
Crie a classe `LegacyLoggerAdapter` que:
- **implementa** `Logger`
- recebe um `LegacyLogger` no construtor
- guarda esse objeto em um atributo privado e final

### 4) Adaptação das chamadas
Implemente:
- `info(message)` deve chamar: `legacy.log("INFO", message)`
- `error(message)` deve chamar: `legacy.log("ERROR", message)`

---

## Parte C — Código cliente (Cliente depende do Target)

### 5) Classe `Application`
Crie uma classe `Application` que:
- recebe um `Logger` no construtor
- possui um método `run()` que executa:
    1. `info("Iniciando aplicação")`
    2. `error("Falha ao conectar no banco")`

**Importante:** `Application` não pode usar `LegacyLogger` diretamente, apenas `Logger`.

---

## Parte D — Teste final

### 6) Classe com `main`
Crie uma classe `Main` (ou equivalente) que:
1. instancia o legado: `LegacyLogger legacy = new LegacyLogger();`
2. cria o adapter: `Logger logger = new LegacyLoggerAdapter(legacy);`
3. injeta no cliente: `Application app = new Application(logger);`
4. executa: `app.run();`

---

## Saída esperada (aproximada)
```
[INFO] Iniciando aplicação
[ERROR] Falha ao conectar no banco
```