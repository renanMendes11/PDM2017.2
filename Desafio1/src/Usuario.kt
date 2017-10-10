class Usuario(
        var nome:String,
        var rendaMensal:Double,
        var classificacao:String) {

    override fun toString(): String {
        return "Nome: ${this.nome} -- Renda: ${this.rendaMensal} -- Classificação: ${this.classificacao}"
    }
}

