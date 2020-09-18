package aula9collections.exercicio1

class Apelidos (val apelidos: HashMap<String, List<String>>) {

    init {
        apelidos["João"] = listOf("Juan, Fissura, Maromba")
        apelidos["Miguel"] = listOf("Night Watch", "Bruce Wayne", "Tampinha")
        apelidos["Maria"] = listOf("Wonder Woman", "Mary", "Marilene")
        apelidos["Lucas"] = listOf("Lukinha", "Jorge", "George")
    }
}