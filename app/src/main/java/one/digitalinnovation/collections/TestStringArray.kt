package one.digitalinnovation.collections

import android.telephony.CarrierConfigManager

fun main(){
    val nomes = Array(4){""}
    nomes[0] = "Paulo"
    nomes[1] = "Paula"
    nomes[2] = "Roberto"
    nomes[3] = "Marisa"
    nomes.forEach {
        println(it)
    }
    println("---------------------------------")

    val nomes2 = arrayOf("Dara","Chiquinho","Papagaio sem nome")
    nomes2.forEach {
        println(it)
    }

}