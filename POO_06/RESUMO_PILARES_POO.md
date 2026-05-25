# Resumo didatico dos 4 pilares da POO

Este material foi escrito em dois niveis:
- explicacao simples: para entender rapido a ideia.
- explicacao completa: para aprofundar e ligar com o codigo do projeto.

---

## 1. Encapsulamento

### Explicacao simples
Encapsulamento e "proteger os dados" de uma classe.
Em vez de mexer direto nos atributos, usamos metodos para ler e alterar os valores.

### Explicacao completa
Quando um atributo e `private`, ele fica escondido para outras classes.
Assim, a propria classe controla como esse dado pode ser alterado.
Isso evita erros (por exemplo, colocar idade negativa ou capacidade invalida)
e deixa o codigo mais seguro e organizado.

### Exemplo no projeto
- Em `Pessoal`, os atributos `nome`, `idade` e `pais` sao `private`.
- A classe oferece `getNome()`, `setNome()`, `getIdade()`, `setIdade()` etc.
- Em `Local`, o metodo `setCapacidade(int capacidade)` so altera se o valor for maior que 0.

Exemplo pratico: em vez de fazer `local.capacidade = -10`, o sistema obriga o uso do setter,
que impede esse valor invalido.

---

## 2. Heranca

### Explicacao simples
Heranca e quando uma classe "filha" aproveita caracteristicas de uma classe "mae".
Assim, nao repetimos codigo.

### Explicacao completa
A heranca cria uma relacao de especializacao.
A classe base guarda o que e comum.
A classe filha reaproveita isso e adiciona o que e especifico dela.
Resultado: codigo mais limpo, facil de manter e com menos duplicacao.

### Exemplo no projeto
- `Jogador` herda de `Pessoal` (`public class Jogador extends Pessoal`).
- `Jogador` recebe de `Pessoal` os dados `nome`, `idade` e `pais`.
- `Jogador` adiciona seus proprios dados: `posicao`, `numeroCamisa` e `golsNaCopa`.

Exemplo pratico: todo jogador e uma pessoa, mas com caracteristicas de futebol.
Por isso, faz sentido criar `Jogador` como extensao de `Pessoal`.

---

## 3. Abstracao

### Explicacao simples
Abstracao e focar no que importa para o problema e esconder detalhes desnecessarios.

### Explicacao completa
Uma classe abstrata define uma ideia geral e regras que as classes filhas devem cumprir.
No projeto, `Pessoal` representa o conceito geral de pessoa no contexto da copa.
Ela nao precisa ser instanciada diretamente, mas serve como base para tipos concretos.
O metodo abstrato obriga a classe filha a dizer "qual e o seu papel" no sistema.

### Exemplo no projeto
- `Pessoal` e abstrata (`public abstract class Pessoal`).
- Ela declara `public abstract String descreverPapel();`.
- `Jogador` implementa esse metodo com uma descricao real do atleta.

Exemplo pratico: se no futuro existir uma classe `Tecnico`, ela tambem pode herdar de
`Pessoal` e implementar `descreverPapel()` do seu jeito.

---

## 4. Polimorfismo

### Explicacao simples
Polimorfismo e usar um mesmo metodo em objetos diferentes, com comportamentos diferentes.

### Explicacao completa
No polimorfismo, uma referencia do tipo da classe base pode apontar para objetos das classes filhas.
Quando chamamos um metodo sobrescrito, Java executa a versao da classe real do objeto em tempo de execucao.
Isso deixa o sistema flexivel e preparado para crescer com novos tipos.

### Exemplo no projeto
No `main` de `POO_06`:
- `Pessoal pessoa1 = jogador1;`
- `Pessoal pessoa2 = jogador3;`
- Ao chamar `descreverPapel()`, quem executa e a implementacao de `Jogador`.

Exemplo pratico: mesmo com variavel do tipo `Pessoal`, cada jogador responde com sua descricao,
sem precisar de `if` para cada tipo.

---

## Fechamento rapido
Se voce lembrar desta sequencia, ja tem uma boa base:
- Encapsulamento: protege os dados.
- Heranca: reaproveita codigo.
- Abstracao: modela o essencial.
- Polimorfismo: permite comportamentos diferentes com a mesma interface.
