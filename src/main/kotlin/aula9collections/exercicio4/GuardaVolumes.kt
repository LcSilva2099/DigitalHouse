package aula9collections.exercicio4

class GuardaVolumes(val dicionario: HashMap<Int, List<Peca>>) {

    var contador: Int = 0

    fun guardarPecas(listaDePeca: List<Peca>): Int {

        dicionario[contador] = listaDePeca

        val contadorAnterior = contador
        contador++

        return contadorAnterior
    }

    fun mostrarPecas() {
        for ((chave, valor) in dicionario) {
            println("Peças no número $chave: $valor")
        }
    }

    fun mostrarPecas(numero: Int) {
        println("Peças no número $numero: ${dicionario[numero]}")
    }

    fun devolverPecas(numero: Int) {
        val temp = dicionario[numero]
        dicionario.remove(numero)
        println("$temp removida.")
    }
}