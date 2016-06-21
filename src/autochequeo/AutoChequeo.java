/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autochequeo;

/**
 *
 * @author hugo
 */
public class AutoChequeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutoValue_Persona p= new AutoValue_Persona("h","b",1900);
        Empleado e =new Empleado();
         Empleado e1 =new Empleado();
        e.Create(null, null, 1900);
        
        Empleado.create("hugo", "ber", 1900);
        Persona.create("h","b",1900);
        
        
        
    }
    
}
