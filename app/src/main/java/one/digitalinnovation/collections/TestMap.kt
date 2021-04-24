package one.digitalinnovation.collections

fun main(){
    val pares: Pair<String,Double> = Pair("Paulo",5000.0)
    val map1 = mapOf(pares)

    map1.forEach { (t, u) -> println("Nome: $t \nSalário: $u")  }


}