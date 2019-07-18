package taller05

import org.junit.Test
import org.junit.jupiter.api.Assertions.*
internal class PaseoTest{
    @Test
    fun prueba1(){
        val p=Paseo(20,40,50,2000,20000,4,5)
        assertEquals(2,p.numbuses())
        assertEquals(320_000,p.costototalbus(80_000))
        assertEquals(2_200_000,p.costototalcomida())
        assertEquals(15,p.numerohabitaciones())
        val (a,b)=p.costohabitaciones()
        assertEquals(300_000,a)
        assertEquals(1_500_000,b)

        p.platocomida(1_500)
        assertEquals(1_500,p.dar_plato())
    }
    @Test
    fun prueba2(){
       val d=Triangulo(40.0,10.0,40.0)
        assertEquals(45.0,d.semiperimetro())
        assertEquals(198.4313483298443,d.Area())
        assertEquals(6.416524180537789,d.circumradius())

    }
    @Test
    fun prueba3(){
        val d1=Hexagono(5.5,6.0)
        assertEquals(99.0,d1.area())

    }
    @Test
    fun prueba4(){
        val d4=Camion(1000.0,100.0,300.0,10.0)
        val (a,b)=d4.viejes_gasolina()
        assertEquals(10,a)
        assertEquals(1,b)
    }
    @Test
    fun prueba5(){
        val d5=Avion(2,10,8)
        assertEquals(1000000,d5.preciorecolectado(1))
        assertEquals(2000000,d5.preciorecolectado(2))
        assertEquals(1000000,d5.preciorecolectado(3))

    }
    @Test
    fun prueba6(){
        val d6=Piramide(2.0,10.0,20.0)
        assertEquals(105.2,d6.troncoPiramide())
        assertEquals(826.6666666666667,d6.volumenpiramide())

    }
    @Test
    fun prueba7(){
        val Krystal= Tronco(6.0,13.0)

        assertEquals(1470.2653618800232,Krystal.volumencono())
    }



}