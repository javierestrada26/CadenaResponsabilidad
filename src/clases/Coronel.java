/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author JAVIER
 */
public class Coronel extends Unidad{

    public Coronel(String nombre, String orden) {
        super(nombre);
        _orden = orden;
        
    }
        /* refinamiento del servicio que utiliza la cadena de responsabilidad, resolviendo
       localmente si tiene órdenes específicas o comportándose convencionalmente en
       caso contrario */

    public String orden()    { return (_orden != null ? _orden : super.orden()); }

    public String toString() { return ("Coronel " + super.toString()); }

    private String _orden;
    
}
