/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAREA2.SERES_VIVOS;

import TAREA2.Seres_vivos;

/**
 *
 * @author Jorge
 */
public class adulto extends Seres_vivos{//extendemos la clase principal
    private String nombre, tipo, fecha, mes;//creamos atributos de tipo String
    private int años, año_nac, dia;//creamos atributos de tipo entero

    public adulto(String nombre, String tipo, int año_nac, int dia, String mes) {//constructor de la clase adulto
        this.nombre = nombre;
        this.tipo = tipo;
        this.año_nac = año_nac;
        this.dia = dia;
        this.mes = mes;
    }

    @Override
    public int edad(){//llamamos al metodo abstracto de la clase principal
        edad = 2018 - año_nac;
        return edad;
    }
    
    @Override
    public String hablar(){
        edad();
        return ("Hola, me llamo "+nombre+" y se hablar.\n"
                + "Soy racional.\n"
                + "Tengo "+edad+" años.\n"
                + "Nací el "+dia+" de "+mes+" del "+año_nac+".\n"
                + "Soy "+tipo);
    }

}
