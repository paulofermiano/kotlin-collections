package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("Joao", 1000.0)
    val maria = Funcionario("Maria", 2000.0)
    val pedro = Funcionario("Pedro", 5000.0)

    val funcionarios = listOf(joao,maria,pedro)

    funcionarios.forEach { println(it) }
    println("----------------------------------")

    println(funcionarios.find{ it.nome == "Maria"})
}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
            
        """.trimIndent()
}
