fun main(args: Array<String>) {
    var users = ArrayList<Usuario>()
    var classificacao = hashMapOf( Corrupcao.Ativa to "Iniciante",
            Corrupcao.Passiva to "Media", Corrupcao.Sistemica to "Avançada")

    var user1 = Usuario("Carlos", 20000.0, classificacao[Corrupcao.Ativa].toString())
    var user2 = Usuario("Pedro", 40000.0, classificacao[Corrupcao.Passiva].toString())
    var user3 = Usuario("Maria", 50000.0, classificacao[Corrupcao.Sistemica].toString())
    users.add(user1)
    users.add(user2)
    users.add(user3)

    for (i in users){
        println(i)
    }


}