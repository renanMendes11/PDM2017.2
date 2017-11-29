import java.util.*

/**
 * Created by Renan on 29/11/2017.
 */
 class Lugar(
    var nome: String,
    var descricao: String,
    var dataRegistro: Date
){
    override fun toString(): String {
        return "Nome: ${this.nome}, Descrição: ${this.descricao}, Data de Registro: ${this.dataRegistro}"
    }

}