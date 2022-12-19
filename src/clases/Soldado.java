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
public class Soldado extends Unidad{
    
        public Soldado(String nombre) {
        super(nombre);
    }
    public String toString() { return ("Soldado " + super.toString()); }
    
}
