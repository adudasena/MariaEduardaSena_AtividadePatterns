# Atividade Prática: Design Patterns (Padrões de Projeto)

Este repositório contém a implementação prática de três padrões de projeto (Design Patterns) solicitados na atividade acadêmica individual. Foram escolhidos um padrão de cada categoria: **Criacional**, **Estrutural** e **Comportamental**.
---

## Padrões de Projeto Implementados

### 1. Prototype (Criacional)
- **Contexto:** Sistema de jogos para clonar personagens semelhantes.
- **Estrutura:** - `Personagem.java`: Classe que implementa `Cloneable` e o método `clone()`.

### 2. Decorator (Estrutural)
- **Contexto:** Sistema de notificações flexível que permite combinar canais de envio (Email, SMS e Slack) de forma dinâmica.
- **Estrutura:**
    - `Notifier.java`: Interface componente.
    - `EmailNotifier.java`: Componente concreto base.
    - `NotifierDecorator.java`: Decorator base abstrato que envolve o `wrappee`.
    - `SmsDecorator.java` & `SlackDecorator.java`: Decorators concretos que estendem o comportamento.

### 3. Observer (Comportamental)
- **Contexto:** Estação (`WeatherStation`) que notifica dinamicamente múltiplos módulos (`ConsoleDisplay` e `FanController`) sobre mudanças de temperatura.
- **Estrutura:**
    - `TemperatureObserver.java`: Interface para os observadores.
    - `WeatherStation.java`: Classe Subject que gerencia inscrições e dispara notificações.
    - `ConsoleDisplay.java` & `FanController.java`: Observadores concretos.
---