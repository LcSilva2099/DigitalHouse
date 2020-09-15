package aula09.exercicio2

class Fatura(val itens: ArrayList<Item>) {

    fun getTotalFatura(): Double {

        var total = 0.0

        itens.forEach {
            total += it.quantidade * it.preco
        }

        return total
    }
}