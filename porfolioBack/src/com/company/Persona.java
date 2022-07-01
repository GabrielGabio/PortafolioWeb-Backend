package com.company;



/*
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  public int idepersona;
  private String nombre;
  private String apellido;
  private String fechaNac;
  private String correo;
  private Educacion new_attribute;

  /*
   * proyectos
   *    */

  private Proyectos new_attribute_1;
  
  //
  // Constructors
  //
  public Persona (Integer idepersona, String nombre, String apellido, String fechaNac, String correo, Educacion new_attribute, Proyectos new_attribute_1) {
    this.idepersona=idepersona;
    this.nombre=nombre;
    this.apellido=apellido;
    this.fechaNac=fechaNac;
    this.correo=correo;
    this.new_attribute=new_attribute;
    this.new_attribute_1=new_attribute_1;
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /*
   * Set the value of idepersona
   * @param newVar the new value of idepersona
   */
  public void setIdepersona (int newVar) {
    idepersona = newVar;
  }

  /*
   * Get the value of idepersona
   * @return the value of idepersona
   */
  public int getIdepersona () {
    return idepersona;
  }

  /*
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /*
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /*
   * Set the value of apellido
   * @param newVar the new value of apellido
   */
  public void setApellido (String newVar) {
    apellido = newVar;
  }

  /*
   * Get the value of apellido
   * @return the value of apellido
   */
  public String getApellido () {
    return apellido;
  }

  /*
   * Set the value of fechaNac
   * @param newVar the new value of fechaNac
   */
  public void setFechaNac (String newVar) {
    fechaNac = newVar;
  }

  /*
   * Get the value of fechaNac
   * @return the value of fechaNac
   */
  public String getFechaNac () {
    return fechaNac;
  }

  /*
   * Set the value of correo
   * @param newVar the new value of correo
   */
  public void setCorreo (String newVar) {
    correo = newVar;
  }

  /*
   * Get the value of correo
   * @return the value of correo
   */
  public String getCorreo () {
    return correo;
  }

  /*
   * Set the value of new_attribute
   * @param newVar the new value of new_attribute
   */
  public void setNew_attribute (Educacion newVar) {
    new_attribute = newVar;
  }

  /*
   * Get the value of new_attribute
   * @return the value of new_attribute
   */
  public Educacion getNew_attribute () {
    return new_attribute;
  }

  /*
   * Set the value of new_attribute_1
   * proyectos
   * 
   * @param newVar the new value of new_attribute_1
   */
  public void setNew_attribute_1 (Proyectos newVar) {
    new_attribute_1 = newVar;
  }

  /*
   * Get the value of new_attribute_1
   * proyectos
   * 
   * @return the value of new_attribute_1
   */
  public Proyectos getNew_attribute_1 () {
    return new_attribute_1;
  }

  //
  // Other methods
  //

}
