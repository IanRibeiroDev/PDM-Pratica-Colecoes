package br.ifpb.pdm.praticas

// Classe para representar uma conta bancária
data class ContaBancaria(val numeroConta: String, var nomeTitular: String, var saldo: Double)

// Gerenciador de Contas Bancárias
class GerenciadorContas {
    private val contas = mutableListOf<ContaBancaria>()

    // Adicionar uma nova conta
    // Kotlin permite usar List e MutableList para armazenar coleções mutáveis.
    fun adicionarConta(conta: ContaBancaria) {
        // Implemente aqui a lógica para adicionar uma conta ao sistema
        contas.add(conta)
    }

    // Remover uma conta pelo número da conta
    // Kotlin permite usar List e MutableList para armazenar coleções mutáveis.
    fun removerConta(numeroConta: String) {
        /* Implemente aqui a lógica para remover uma conta pelo número */
        val conta = contas.find { it.numeroConta == numeroConta }
        contas.remove(conta)
    }

    // Listar todas as contas
    // Kotlin permite usar List e MutableList para armazenar coleções mutáveis.
    fun listarContas() {
        // Implemente aqui a lógica para listar todas as contas
        contas.forEach { println(it) }
    }

    // Verificar se uma conta existe pelo número da conta
    // Kotlin permite usar Set para verificar a existência de elementos de forma eficiente.
    fun contaExiste(numeroConta: String): Boolean {
        return contas.any { it.numeroConta == numeroConta }
    }

    // Filtrar contas com saldo positivo
    // Kotlin permite usar funções de ordem superior, como filter, para filtrar coleções.
    fun filtrarContasComSaldoPositivo(): List<ContaBancaria> {
        // Implemente aqui a lógica para filtrar as contas com saldo positivo
        return contas.filter { it.saldo > 0 }
    }

    // Verificar se alguma conta possui saldo negativo
    // Kotlin permite usar funções de ordem superior, como any, para verificar elementos de uma coleção.
    fun algumaContaComSaldoNegativo(): Boolean {
        // Implemente aqui a lógica para verificar se alguma conta possui saldo negativo
        return contas.any { it.saldo < 0 }
    }

    // Calcular o saldo total de todas as contas
    // Kotlin permite usar funções de ordem superior, como reduce, para reduzir uma coleção a um único valor.
    fun calcularSaldoTotal(): Double {
        // Implemente aqui a lógica para calcular o saldo total de todas as contas
        return contas.map { it.saldo }.reduce { acc, saldo -> acc + saldo }
    }
}

fun main() {
    // Criar um objeto gerenciador de contas
    val gerenciador = GerenciadorContas()

    // Adicionar algumas contas
    gerenciador.adicionarConta(ContaBancaria("123456", "Fulano", 1500.0))
    gerenciador.adicionarConta(ContaBancaria("789012", "Ciclano", -500.0))
    gerenciador.adicionarConta(ContaBancaria("345678", "Beltrano", 1000.0))

    // Filtrar contas com saldo positivo
    val contasComSaldoPositivo = gerenciador.filtrarContasComSaldoPositivo()
    println("Contas com saldo positivo:")
    contasComSaldoPositivo.forEach { println(it) }

    // Verificar se alguma conta possui saldo negativo
    val algumaContaNegativa = gerenciador.algumaContaComSaldoNegativo()
    println("Alguma conta possui saldo negativo? $algumaContaNegativa")

    // Calcular o saldo total de todas as contas
    val saldoTotal = gerenciador.calcularSaldoTotal()
    println("Saldo total de todas as contas: $saldoTotal")

    println()
    println("Listando contas: ")
    gerenciador.listarContas()

    println("Verificando se conta existe: 123456 existe")
    println(gerenciador.contaExiste("123456"))

    println("Removendo conta: 123456\n")
    gerenciador.removerConta("123456")

    println("Listando contas: ")
    gerenciador.listarContas()
    println("Verificando se conta existe: 123456 existe")
    println(gerenciador.contaExiste("123456"))
}