package one.digitalinnovation.collections

fun main(){
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0)


    for (salario in salarios) {
        println(salario)
    }

    println("-------------------------------------")
    println("Maior salário: ${salarios.max()}")
    println("Menor salário: ${salarios.min()}")
    println("Média dos salários: ${salarios.average()}")



    val salariosMaioresQue2500 = salarios.filter { it > 2000.0 }
    println("-------------------------------------")
    salariosMaioresQue2500.forEach { println(it) }
    println("-------------------------------------")
    println(salarios.count{it in 1500.0..5000.0})
    println("-------------------------------------")
    println(salarios.find{it == 4000.0})
    println("-------------------------------------")
    println(salarios.any{it == 4000.0})
    println(salarios.any{it == 4000.1})

}