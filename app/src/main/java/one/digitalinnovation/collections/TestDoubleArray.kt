package one.digitalinnovation.collections

fun main(){
    val valores = doubleArrayOf(1.2,1.3,1.6,2.0)
    valores.forEach {
        println(it)
    }
    println("---------------------------------")

    val valores2 = DoubleArray(2)
    valores2[0]=5.1
    valores2[1]=8.1
    valores2.forEach {
        println(it)
    }

}