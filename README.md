## PRÁTICA SOBRE COLEÇÕES
**Atividade Prática: Sistema Bancário em Kotlin**

**Introdução:**
Neste exercício prático, você irá implementar um sistema bancário em Kotlin utilizando diferentes tipos de coleções, como List, Set e MutableList, além de explorar operações comuns em coleções, programação funcional e coleções mutáveis e imutáveis.

**Instruções:**
Classe Conta Bancária: Implemente a classe ContaBancaria com os seguintes atributos: numeroConta, nomeTitular e saldo. Utilize a função data class para criar a classe.

**Gerenciador de Contas Bancárias: Implemente a classe GerenciadorContas com os seguintes métodos:**

1.adicionarConta: Adiciona uma nova conta ao sistema.

2.removerConta: Remove uma conta pelo número da conta.

3.listarContas: Lista todas as contas bancárias cadastradas.

4.contaExiste: Verifica se uma conta existe pelo número da conta.

5.Filtrar Contas com Saldo Positivo: Adicione a função filtrarContasComSaldoPositivo à classe GerenciadorContas para filtrar e retornar todas as contas com saldo positivo.

6.Verificar Existência de Conta Negativa: Adicione a função algumaContaComSaldoNegativo à classe GerenciadorContas para verificar se alguma conta possui saldo negativo.

7.Calcular Saldo Total: Adicione a função calcularSaldoTotal à classe GerenciadorContas para calcular e retornar o saldo total de todas as contas.

**Observações:**
Utilize os conceitos de coleções e operações comuns em Kotlin, como filter, any e reduce, para implementar as funções necessárias.
Explore tanto as coleções mutáveis (MutableList) quanto as imutáveis (List) para armazenar as contas bancárias e observe as diferenças.