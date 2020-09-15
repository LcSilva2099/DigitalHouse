package aula09.exercicio3

import java.util.*

fun main() {
    val estoque = Estoque("Mouse", 5, 4)

    println(estoque.mostra())
    precisaRepor(estoque)
    println(estoque.mostra())

    estoque.darBaixa(5)
    precisaRepor(estoque)
    println(estoque.mostra())

    estoque.mudarQtdMinima(20)
    estoque.mudarNome("Mouse sem fio")
    println(estoque.mostra())
    precisaRepor(estoque)
}

fun precisaRepor(estoque: Estoque) {

    println("Preciso repor?")

    if (estoque.precisaRepor()) {
        val scanner = Scanner(System.`in`)
        println("Sim, quantos itens deseja repor?\n")
        val n = scanner.nextInt()
        estoque.repor(n)
        println("$n itens foram repostos")
    } else {
        println("Sem necessidade")
    }
}