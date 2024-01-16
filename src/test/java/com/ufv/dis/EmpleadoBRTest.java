package com.ufv.dis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {
    //Version 1.0
    EmpleadoBR empleado = new EmpleadoBR();
    @Test
    void calculaSalarioBruto() throws BRException{
        assertEquals(1360,empleado.calculaSalarioBruto(TipoEmpleado.VENDEDOR,2000,8));
        assertThrows(BRException.class, ()->{empleado.calculaSalarioBruto("",1500,-1);});
    }

    @Test
    void calculaSalarioNeto() throws BRException{
        assertEquals(1640, empleado.calculaSalarioNeto(2000));
        assertEquals(1230, empleado.calculaSalarioNeto(1500));
        assertThrows(BRException.class,()->{empleado.calculaSalarioNeto(-1);});

    }
}