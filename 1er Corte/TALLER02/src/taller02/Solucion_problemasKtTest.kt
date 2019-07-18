package taller02

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Solucion_problemasKtTest


internal class TallerKtTest {
    @Test
    fun ProbarEjecicioA() {
        var datos = ejercicio(2500.0, 100)
        var numbicis = datos.first
        var total = datos.second
        assertEquals(50, numbicis)
        assertEquals(125000.0, total)

    }

    @Test
    fun probarejer() {
        assertEquals(81, DANE(1000))
    }

    @Test
    fun probarArea() {
        assertEquals(2.0, areadeltriangulo(2.0, 2.0))
    }

    @Test
    fun cambio() {
        assertEquals(28320000.0, convercion(10000.0, 2832.0))
    }

    @Test
    fun volumencono() {
        assertEquals(20.943951023931955, volumencono(2.0, 5.0))
    }
    @Test
    fun edadmenorde(){
        var datos2=edadandnombre("brayan","sebastian","camilo",12,18,18)
        var nombre=datos2.first
        var edad=datos2.second
        assertEquals("brayan",nombre)
        assertEquals(12,edad)
    }
    @Test
    fun pintorcobra(){
        assertEquals( 10000.0,pintor(1000.0,10.0))
    }
    @Test
    fun valorpresente(){
        assertEquals(2.0176569459262645E-8, valor_presente(1.22,5,10))
    }
    @Test
    fun descuenyo_iva(){
        var datos3= precio_articulo(1000.0)
        var des=datos3.first
        var pt=datos3.second
        assertEquals(950.0,des)
        assertEquals(180.5,pt)
    }
    @Test
    fun litros(){
        assertEquals(70000.0, litros_contaminados(100))
    }
    @Test
    fun cables(){
        assertEquals(87, computadores_cables(88))
    }
    @Test
    fun edad(){
        assertEquals(19,edad1(2018,1999))
    }
    @Test
    fun estaciona(){
        assertEquals(15000.0, estacionamiento(3000.0,5))
    }
    @Test
    fun definitiva(){
        assertEquals(67.5, notasfinal(20.0,50.0,100.0))
    }
    @Test
    fun mujermm(){
        var datos4= mujermaravilla(5120.0)
        var mts=datos4.first
        var s=datos4.second
        assertEquals(21,mts)
        assertEquals(33,s)
    }
    @Test
    fun timpos(){
        assertEquals(2, tiempo(50.0,100.0))
    }
    @Test
    fun bequitas(){
        assertEquals("2000.00", becas(19,95.0))
    }


}