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
public abstract class Persona {
    
     /**
    * Create instance of Person.
    *
    * @param lastName Last name of person.
    * @param firstName First name of person.
    * @param birthYear Birth year of person.
    * @return Instance of Person.
    */
   static Persona create(String lastName, String firstName, long birthYear)
   {
      return new AutoValue_Persona(lastName, firstName, birthYear);
   }

   /**
    * Provide Person's last name.
    *
    * @return Last name of person.
    */
   abstract String lastName();

   /**
    * Provide Person's first name.
    *
    * @return First name of person.
    */
   abstract String firstName();

   /**
    * Provide Person's birth year.
    *
    * @return Person's birth year.
    */
   abstract long birthYear();
}
    

