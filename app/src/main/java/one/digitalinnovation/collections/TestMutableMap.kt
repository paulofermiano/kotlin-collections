package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("Joao", 1000.0, "PJ")
    val maria = Funcionario("Maria", 2000.0, "PJ")
    val pedro = Funcionario("Pedro", 5000.0, "PF")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)

    println(repositorio.findById(pedro.nome))
}