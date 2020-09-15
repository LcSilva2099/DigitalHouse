package aula09.exercicio2

fun main() {
    val item1 = Item(1L, "Tênis", 2, 100.0)
    val item2 = Item(2L, "Camisa", 4, 20.0)
    val item3 = Item(3L, "Meia", 12, 3.0)

    println("Item 1: ${item1.descricao}, ${item1.preco}, ${item1.quantidade}")

    val fatura = Fatura(arrayListOf(item1, item2, item3))

    println("Valor da fatura: ${fatura.getTotalFatura()}")
}