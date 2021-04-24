package one.digitalinnovation.collections

fun main(){

    val joao = Funcionario("Joao", 1000.0, "PJ")
    val maria = Funcionario("Maria", 2000.0, "PJ")
    val pedro = Funcionario("Pedro", 5000.0, "PF")

    val funcionarios = mutableListOf(joao,maria)
    funcionarios.forEach{
        println(it)
    }
    println("----------------------------------")
    funcionarios.add(pedro)
    funcionarios.forEach{
        println(it)
    }
    println("----------------------------------")
    funcionarios.remove(pedro)
    funcionarios.forEach{
        println(it)
    }
}