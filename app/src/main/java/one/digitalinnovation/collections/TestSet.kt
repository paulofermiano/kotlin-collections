package one.digitalinnovation.collections

fun main(){

    val joao = Funcionario("Joao", 1000.0, "PJ")
    val maria = Funcionario("Maria", 2000.0, "PJ")
    val pedro = Funcionario("Pedro", 5000.0, "PF")

    val funcionarios1 = setOf(joao,maria)
    val funcionarios2 = setOf(pedro)
    val funcionarios3 = setOf(joao,maria,pedro)


    println("----------------------------------")

    val resultSubtract = funcionarios3.subtract(funcionarios1)
    println(resultSubtract)

    println("----------------------------------")

    val resultIntersect = funcionarios3.intersect(funcionarios1)
    println(resultIntersect)
}