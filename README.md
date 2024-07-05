---

# Calculadora em Java com JOptionPane

Este é um simples programa em Java que utiliza a classe `JOptionPane` para criar uma interface de usuário baseada em caixas de diálogo. A calculadora oferece funcionalidades básicas de soma, subtração, multiplicação e divisão.

## Estrutura do Projeto

O projeto consiste em um único arquivo Java:

- **Calculadora.java**: Contém o código-fonte da calculadora.

## Funcionalidades

### 1. Menu de Opções

Ao iniciar o programa, o usuário é apresentado com um menu de opções usando `JOptionPane.showInputDialog`. Ele pode escolher entre as seguintes operações:

- Soma
- Subtração
- Multiplicação
- Divisão
![image](https://github.com/andresalidia/Calculadora/assets/86450495/f551b697-170a-420e-90d1-2a54610faa96)

### 2. Switch Case para Executar Operações

O código utiliza um bloco `switch` para determinar qual operação matemática executar com base na escolha do usuário.

### 3. Entrada de Dados

Para cada operação, o programa solicita ao usuário que insira dois números usando `JOptionPane.showInputDialog`. Os números são então convertidos de `String` para `int` ou `double` usando `Integer.parseInt` ou `Double.parseDouble`.

### 4. Cálculos

Depois de receber os números do usuário, o programa realiza os cálculos apropriados:

- **Soma**: `soma1 + soma2`
- **Subtração**: `sub1 - sub2`
- **Multiplicação**: `mult1 * mult2`
- **Divisão**: `div1 / div2`

### 5. Exibição do Resultado

Após o cálculo, o resultado é exibido em uma caixa de mensagem usando `JOptionPane.showMessageDialog`.

### 6. Tratamento de Erros

O programa inclui uma mensagem de aviso caso o usuário escolha uma opção inválida (opção não encontrada).

## Como Executar

Para executar o programa:

1. Certifique-se de ter o ambiente de desenvolvimento Java configurado.
2. Compile o arquivo `Calculadora.java`.
3. Execute o arquivo compilado.

Exemplo de comando para compilar e executar no terminal:

```bash
javac Calculadora.java
java Calculadora
```

## Contribuições

Contribuições são bem-vindas via pull requests. Se você encontrar problemas ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue.

## Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE.md](LICENSE.md) para mais detalhes.
---
