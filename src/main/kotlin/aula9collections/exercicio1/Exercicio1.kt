package aula9collections.exercicio1

fun main() {
    val loteriaDosSonhos = LoteriaDosSonhos(HashMap())
    val apelidos = Apelidos(HashMap())

    for ((chave, valor) in loteriaDosSonhos.numeros) {
        println("Número: $chave. Significado: $valor")
    }

    for ((chave, valor) in apelidos.apelidos) {
        println("Apelido: $chave -> $valor")
    }
}