package one.digitalinnovation.collections

fun main(){
    val salarios = arrayOf(
                    "2000".toBigDecimal(),
                    "1500".toBigDecimal(),
                    "5000".toBigDecimal()
    )
    println("---------------")
    println("""
                Somatoria: ${salarios.somatoria()}
                Media: ${salarios.media()}
            """
            )
}