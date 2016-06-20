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


import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_Persona extends Persona {

  private final String lastName;
  private final String firstName;
  private final long birthYear;

   AutoValue_Persona(
      String lastName,
      String firstName,
      long birthYear) {
    if (lastName == null) {
      throw new NullPointerException("Null apellido");
    }
    this.lastName = lastName;
    if (firstName == null) {
      throw new NullPointerException("Null nombre");
    }
    this.firstName = firstName;
    this.birthYear = birthYear;
  }

  @Override
  String lastName() {
    return lastName;
  }

  @Override
  String firstName() {
    return firstName;
  }

  @Override
  long birthYear() {
    return birthYear;
  }

  @Override
  public String toString() {
    return "Person{"
        + "lastName=" + lastName + ", "
        + "firstName=" + firstName + ", "
        + "birthYear=" + birthYear
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Persona) {
      Persona that = (Persona) o;
      return (this.lastName.equals(that.lastName()))
           && (this.firstName.equals(that.firstName()))
           && (this.birthYear == that.birthYear());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.lastName.hashCode();
    h *= 1000003;
    h ^= this.firstName.hashCode();
    h *= 1000003;
    h ^= (this.birthYear >>> 32) ^ this.birthYear;
    return h;
  }

}
