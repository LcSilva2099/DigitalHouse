package aula09.exercicio3

class Estoque(var nome: String, var qtdAtual: Int, var qtdMinima: Int) {

    fun mudarNome(nome: String) {
        this.nome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int) {
        this.qtdMinima = qtdMinima
    }

    fun repor(qtd: Int) {
        qtdAtual += qtd
    }

    fun darBaixa(qtd: Int) {
        qtdAtual -= qtd
    }

    fun mostra(): String {
        return "Produto: $nome\nQuantidade mínima: $qtdMinima\nQuantidade atual: $qtdAtual"
    }

    fun precisaRepor(): Boolean {
        return qtdAtual <= qtdMinima
    }
}