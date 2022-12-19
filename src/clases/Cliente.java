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
public class Cliente {
    public static void main(String argv[]) {
        
      Unidad truman = new Coronel("Truman", "Tomar posición enemiga");
      Unidad ryan   = new Soldado("Ryan");
      Unidad rambo  = new Soldado("Rambo");
      
      System.out.println(rambo.orden());    // rambo -> para ver la orden que tiene 

      rambo.establecerMando(truman);
      System.out.println(rambo.orden());    // rambo -> truman

      ryan.establecerMando(rambo);
      System.out.println(ryan.orden());     // ryan -> rambo -> truman
    }
}
