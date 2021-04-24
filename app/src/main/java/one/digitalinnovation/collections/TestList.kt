package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("Joao", 1000.0, "PJ")
    val maria = Funcionario("Maria", 2000.0, "PJ")
    val pedro = Funcionario("Pedro", 5000.0, "PF")

    val funcionarios = listOf(joao,maria,pedro)

    funcionarios.forEach { println(it) }
    println("----------------------------------")

    println(funcionarios.find{ it.nome == "Maria"})


    println("----------------------------------")

    funcionarios.sortedByDescending { it.nome }.forEach { println(it) }
    println("----------------------------------")

    funcionarios.groupBy { it.tipo_contratacao }.forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipo_contratacao: String
){
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
            
        """.trimIndent()
}
