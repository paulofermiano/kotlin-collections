package one.digitalinnovation.collections

fun main(){
    val values = IntArray(5)
    values[0] = 3
    values[1] = 6
    values[2] = 9
    values[3] = 12
    values[4] = 15
    for(valor in values){
        println(valor)
    }
    values.sortDescending()
    values.forEach {valor ->
        println(valor)
    }
}
