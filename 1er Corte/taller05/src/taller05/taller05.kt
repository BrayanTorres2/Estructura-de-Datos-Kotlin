package taller05

import javax.xml.crypto.dom.DOMCryptoContext

class Paseo{
    private var gordos:Int=0
    private var flacos:0
    private var numsillasporbus=0
    private var valorplatocomida=0
    private var valorhabitacion=0
    private var numpersonashabitacion=0
    private var numdias=0

    public constructor(gordos: Int, flacos: Int, numsillasporbus: Int, valorplatocomida: Int, valorhabitacion: Int, numpersonashabitacion: Int, numdias: Int) {
        this.gordos = gordos
        this.flacos = flacos
        this.numsillasporbus = numsillasporbus
        this.valorplatocomida = valorplatocomida
        this.valorhabitacion = valorhabitacion
        this.numpersonashabitacion = numpersonashabitacion
        this.numdias = numdias

    }
    //hallar numero de buses
    fun numbuses():Int{
        val nb=(gordos*2+flacos)/numsillasporbus
        if((gordos*2+flacos)%numsillasporbus!=0){
            return nb+1
        }
        return nb
    }
    //hallar costo bus
    fun costototalbus(alquilerbus:Int):Int{
       return numbuses()*alquilerbus*2
    }
    //hallar valor total comida
    fun costototalcomida():Int{
        val costodia=(gordos*5+flacos*3)*valorplatocomida
        val costocomidatotal=costodia*numdias
        return costocomidatotal
    }
    //hallar numero de habitaciones
    fun numerohabitaciones():Int{
        var nh=(gordos+flacos)/numpersonashabitacion
        if((gordos+flacos)%numpersonashabitacion!=0){
            nh++
        }
        return nh
    }
    //hallar costo habitaciones
    fun costohabitaciones():Pair<Int,Int>{
        val costodia=valorhabitacion*numerohabitaciones()
        val costototal=costodia*numdias
        return costodia to costototal

    }
    //modificar
    fun platocomida(nuevoplato:Int){
        valorplatocomida=nuevoplato
    }
    //dar valor
    fun dar_plato()=valorplatocomida

}
class Triangulo {
    private var lado_a = 0.0
    private var lado_b = 0.0
    private var lado_c = 0.0

    //constructor
    constructor(lado_a:Double, lado_b:Double, lado_c: Double) {
        this.lado_a = lado_a
        this.lado_b = lado_b
        this.lado_c = lado_c
    }

    //Metodos analizadores
    public fun darlado_a(): Double {
        return lado_a
    }

    public fun darlado_b(): Double {
        return lado_b
    }

    public fun darlado_c(): Double {
        return lado_c
    }

    //semiperimetro
    fun semiperimetro(): Double {
        return (lado_a + lado_b + lado_c) / 2.0
    }

    //Area
    fun Area(): Double {
        val a = Math.sqrt(semiperimetro() * (semiperimetro() - darlado_a()) * (semiperimetro() - darlado_b()) * (semiperimetro() - darlado_c()))
        return a

    }

    //circumradius
    fun circumradius(): Double {
        return ((lado_a * lado_b * lado_c) / (4 * Math.PI * Area()))
    }
}
class Hexagono {
    private  var lado1:Double=0.0
    private var apotema:Double=0.0
    constructor(lado1: Double, apotema: Double) {
        this.lado1 = lado1
        this.apotema = apotema
    }
    //Area
    fun area():Double{
        var area=6*lado1*apotema/2
        return area
    }


}
/*
Datos de Entrada
-Carga--carga--Double
-Capacidad Maxima de Carga del camion-->MC-->Double
-Kilometros a recorrer---km-->Double
-tanke lleno del camion(L)--Tanke-->Double
Datos de Salida
-Viajes por hacer-->viajes-->Int
- Galones de gasolina--gg->Int
 */
class Camion{
    private var carga:Double=0.0
    private var MC:Double=0.0
    private  var km:Double=0.0
    private var Tanke:Double=0.0
     //constructores
    constructor(carga: Double, MC: Double, km: Double, Tanke: Double) {
        this.carga = carga
        this.MC = MC
        this.km = km
        this.Tanke = Tanke
    }
    //analizadore
    fun darcarga():Double{
        return carga
    }
    fun darMc():Double{
        return MC
    }
    fun darKm():Double{
        return km
    }
    fun darTanke():Double{
        return Tanke
    }
    //Modificadores
    fun Newcarga(nueva_carga:Double){
        carga=nueva_carga
    }
    fun NewMc(nueva_MC:Double){
        MC=nueva_MC
    }
    fun Newkm(nueva_km: Double){
        km=nueva_km
    }
    fun NewTanke(nueva_Tanke: Double){
        Tanke=nueva_Tanke
    }
    fun viejes_gasolina():Pair<Int,Int>{
        var viajes=carga/MC
        var consumoL=(100*Tanke)/km
        var gg=(consumoL)/3.8
        if(consumoL%3.8!=0.0){
            gg=gg+1

        }
        if (carga%MC != 0.0 ){
            viajes=viajes+1
        }

        return viajes.toInt() to gg.toInt()
    }
}
class Avion{
    private var numero_pasajerosclase1:Int=0
    private var numero_pasajerosclase2:Int=0
    private var numero_pasajerosclase3:Int=0
    //constructor
    constructor(numero_pasajerosclase1: Int, numero_pasajerosclase2: Int, numero_pasajerosclase3: Int) {
        this.numero_pasajerosclase1 = numero_pasajerosclase1
        this.numero_pasajerosclase2 = numero_pasajerosclase2
        this.numero_pasajerosclase3 = numero_pasajerosclase3
    }
    open class Divisiones(){

    }
    class Clase1 {
        private val costo1=500_000
    }
    class Clase2{
        private  val costo2=200_000


    }
    class Clase3{
        private val costo3=125_000
    }
    //funcion
    fun preciorecolectado(clase:Int):Int{

        if(clase==1){
           var preciototal=numero_pasajerosclase1*500000
            return preciototal
        }
        if(clase==2){
           var preciototal=numero_pasajerosclase2*200000
            return preciototal
        }
        if(clase==3){
            var preciototal=numero_pasajerosclase3*125_000
            return preciototal
        }
        else{
            return 0
        }



    }
}
class Piramide{
    private var B:Double=0.0
    private var b:Double=0.0
    private var h:Double=0.0

    constructor(B: Double, b: Double, h: Double) {
        this.B = B
        this.b = b
        this.h = h
    }
    //hallar el area del tronco de la piramide
    fun troncoPiramide():Double{
        val areaBases=(Math.pow(b,2.0)+Math.pow(B,2.0))
        val pm=((B*4)+(b*4))/(2*h)
        return areaBases+pm
    }
    //hallar volumen
    fun volumenpiramide():Double{
        val abasesMayo=Math.pow(b,2.0)
        val abaseMenor=Math.pow(B,2.0)
        return h/3*(abasesMayo+abaseMenor+Math.sqrt(abasesMayo*abaseMenor))
    }
}
class Tronco{
    private var radio: Double=0.0
    private var altura: Double=0.0

    //Construstor
    constructor(radio: Double, altura: Double) {
        this.radio = radio
        this.altura = altura
    }
    //Volumen
    fun volumencono (): Double{
        val base = (Math.PI*Math.pow(radio,2.0))*altura
        return base
    }
}



