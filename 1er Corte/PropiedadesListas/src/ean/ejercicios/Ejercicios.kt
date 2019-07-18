package ean.ejercicios

import ean.collections.IList
import ean.collections.list

// Imprimir una lista
fun imprimir(lista: IList<Int>) {
    for (i in 0 until lista.size) {
        println(lista[i])
    }
}

fun digitos(num: Int):IList<Int>{
    val digs=list<Int>()
    var n=num
    while(n>0){
        val u=n%10// binarios 2
        digs.addToHead(u)
        n/=2
    }
    return  digs
}
fun contarImpares(lista: IList<Int>):Int{
    var c=0
    for(i in 0 until lista.size){
        val elem=lista[i] //lista.get(i)
        if(elem%2!=0){
            c++
        }
    }
    return c
}
fun contarImpares2(lista: IList<Int>):Int{
    var c=0
    for(elem in lista){
        if(elem%2!=0){
            c+=1
        }
    }
    return  c
}
fun contarImpares3(lista: IList<Int>):Int{
    var c=0
    lista.forEach {
        if(it%2!=0){
            c++
        }
    }
    return c
}
fun contarImpares4(lista:IList<Int>):Int {
    var c = 0
    var iter = lista.iterator()
    while (iter.hasNext()) {
        val elem = iter.next()
        if (elem % 2 != 0) {
            c++
        }
    }
    return c
}
fun imprimirAlreves(lista: IList<Int>):Unit{
    for(i in lista.size-1 downTo 0)
        println(lista[i])

}
// Programa principal
fun main(args: Array<String>) {
    val unaLista = list(4, 3, 1, 8)
    imprimir(unaLista)
    print("tamaño de la lista=${unaLista.size}")
    unaLista.add(18)
    unaLista.addToHead(5)
    println("la lista=$unaLista ")
    unaLista.add(3,7)
    println("ahora la sita es = $unaLista")
    unaLista.removeLast()
    println("la lista sin el 10=$unaLista")

    unaLista.removeElement(1)
    unaLista.remove(1)
    unaLista.set(4,11)//unaLista[4]=11
    println("sin el 4 y cambio el 8=$unaLista")
    println("hay ${contarImpares(unaLista)} en esta lista")
    imprimirAlreves(unaLista)
    digitos(1234)
}
