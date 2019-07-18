package taller04

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TrianguloTest{
    @Test
    fun pruebauno(){
        //val t1=Triangulo()
        val t2=Triangulo(4.0,5.0,3.0)
        assertEquals(4.0,t2.darLado1())
        assertEquals(6.0,t2.semiperimetro())
        assertEquals("Escaleno",t2.tipo())
        assertEquals(6.0,t2.area())
    }
    @Test
    fun ejercicio2(){
        val t1=Trapecion(10.0,20.0,30.0)
        assertEquals(450.0,t1.area_trapecio())
        assertEquals(15.0,t1.promedio())
    }

    @Test
    fun ejercicio3(){
        val t3=Paseo(10,15,30,30,40000.0,12000.0,14000.0,50000.0)
        assertEquals(2,t3.numero_buses())
        assertEquals(45,t3.numero_desayunos())
        assertEquals(75,t3.numero_almuerzos())
        assertEquals(22,t3.numero_habitaciones())
        assertEquals(2.698E7,t3.precio_paseo())
    }
}