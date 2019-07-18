package taller04

class Triangulo{
    private var lado1:Double=0.0
    private var lado2:Double=0.0
    private var lado3=0.0
    //Constructor
    public constructor (lado1:Double,lado2:Double,lado3:Double){
        this.lado1=lado1
        this.lado2=lado2
        this.lado3=lado3
    }
    //Metodo analizadores
    public fun darLado1():Double{
        return lado1
    }

    public fun darLado2():Double{
        return lado2
    }

    public fun darlado3():Double{
        return this.lado3
    }
    //semiperimetro
    public fun semiperimetro():Double{
        return (this.lado1+this.lado2+this.lado3)/2.0
    }
    //saber cual triangulo es
    public fun tipo():String{
        if(lado1==lado2&&lado1==lado3){
            return "Equilatero"
        }
        if(lado1==lado2||lado1==lado3||lado2==lado3){
            return "Isoceles"
        }
        return "Escaleno"
    }
    //area del triangulo
    public fun area():Double{
       return Math.sqrt(semiperimetro()*(semiperimetro()-darLado1())*(semiperimetro()-darLado2())*(semiperimetro()-darlado3()))
    }
}
class Trapecion{
    private var base_menor: Double = 0.0
    private var base_mayor: Double = 0.0
    private var altura: Double = 0.0
    //Constructor

    constructor(base_menor: Double, base_mayor: Double, altura: Double) {
        this.base_menor = base_menor
        this.base_mayor = base_mayor
        this.altura = altura
    }

    //Area Del Trapecio
    public fun area_trapecio(): Double {
        return (base_mayor + base_menor) * altura / 2
    }

    //Promedio Analizador
    public fun promedio(): Double {
        return (base_mayor + base_menor) / 2
    }

}
class Paseo {
    private var numero_dias=0
    private var numero_gordos=0
    private var numero_flacos=0
    private var numero_sillas=0
    private var precio_alquiler=0.0
    private var precio_desayuno=0.0
    private var precio_almuerzo=0.0
    private var precio_hotel_noche=0.0
    //Constructor
    public constructor(numero_dias:Int,numero_gordos:Int,numero_flacos:Int,numero_sillas:Int,precio_alquiler:Double,precio_desayuno:Double,precio_almuerzo:Double,precio_hotel_noche:Double){
        this.numero_dias=numero_dias
        this.numero_gordos=numero_gordos
        this.numero_flacos=numero_flacos
        this.numero_sillas=numero_sillas
        this.precio_alquiler=precio_alquiler
        this.precio_desayuno=precio_desayuno
        this.precio_almuerzo=precio_almuerzo
        this.precio_hotel_noche=precio_hotel_noche

    }
    //Analizador
    public fun darnumerodias():Int{
        return numero_dias
    }
    public fun darnumero_gorgos():Int{
        return  numero_gordos
    }
    public fun darnumero_flacos():Int{
        return numero_flacos
    }
    public fun darnumero_sillas():Int{
        return numero_sillas
    }
    public fun darprecio_alquiler():Double{
        return precio_alquiler
    }
    public  fun darprecio_desayunos():Double{
        return precio_desayuno
    }
    public fun darprecio_almuezo():Double{
        return precio_almuerzo
    }
    public fun darprecio_hotel_noche():Double{
        return  precio_hotel_noche
    }
    //---------------------------------------------------------------------------------------------
    // numero de buses para el paseo
    public fun numero_buses():Int{
        val a:Double=((numero_gordos*2.0)+numero_flacos)/numero_sillas
        if((a%2)!=0.0){
            return a.toInt()+1

        }
        return  a.toInt()
    }
    //determinar el numero de desayunos que toman los estudiantes
    public fun numero_desayunos():Int{
        return numero_gordos+numero_flacos

    }
    //determine el numero de almuerzos
    public fun numero_almuerzos():Int{
        return (numero_flacos)+(numero_gordos*3)
    }
    //determine el numero de habitaciones
    public fun numero_habitaciones():Int{
        val a:Double=(numero_flacos+numero_gordos)/2.0
        if((a%2)!=0.0){
        val b=a.toInt()+1
        }
        return a.toInt()


    }
    //precio total de los buses
    public fun precio_paseo():Double{
        return (numero_buses()*precio_alquiler)+(numero_dias*((numero_desayunos()*precio_desayuno)+(numero_almuerzos()*precio_almuerzo)+(numero_habitaciones()*precio_hotel_noche)))
    }

}