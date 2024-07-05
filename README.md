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

Exemplo com subtração:

![image](https://github.com/andresalidia/Calculadora/assets/86450495/6d919e5a-14ef-4f60-9c27-efda1672a267)

![image](https://github.com/andresalidia/Calculadora/assets/86450495/426cedb8-9e6f-4c86-8dec-88978abe82f2)

![image](https://github.com/andresalidia/Calculadora/assets/86450495/28d9ece6-cc4d-460d-a46a-a227210ea1d9)

### 5. Exibição do Resultado

Após o cálculo, o resultado é exibido em uma caixa de mensagem usando `JOptionPane.showMessageDialog`.

![image](https://github.com/andresalidia/Calculadora/assets/86450495/b839fdb3-0eb5-4f3e-b3aa-6f37ccbfe924)

### 6. Tratamento de Erros

O programa inclui uma mensagem de aviso caso o usuário escolha uma opção inválida (opção não encontrada).

![image](https://github.com/andresalidia/Calculadora/assets/86450495/f1d37eac-2909-41e6-ae59-a4ffd321b416)

## Contribuições

Contribuições são bem-vindas via pull requests. Se você encontrar problemas ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue.

## Licença

Este projeto está licenciado sob a MIT License - veja o arquivo [LICENSE.md](LICENSE.md) para mais detalhes.
---
