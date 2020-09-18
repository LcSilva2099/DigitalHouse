package aula9collections.exercicio4

fun main() {
    val guardaVolumes = GuardaVolumes(HashMap())

    guardaVolumes.guardarPecas(listOf(Peca("Nike", "Camisa")))
    guardaVolumes.guardarPecas(listOf(Peca("Adidas", "Tenis")))

    guardaVolumes.mostrarPecas()

    guardaVolumes.devolverPecas(0)
    guardaVolumes.devolverPecas(1)
}