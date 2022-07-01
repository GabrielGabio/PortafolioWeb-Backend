package com.company;



/*
 * Class usuarios
 */
public class Usuarios {

  //
  // Fields
  //

  private int idusuarios;
  private String usuario;
  private String contraseña;
  
  //
  // Constructors
  //
  public Usuarios() { };

  public Usuarios(int idusuarios, String usuario, String contraseña) {
    this.idusuarios = idusuarios;
    this.usuario = usuario;
    this.contraseña = contraseña;
  }
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /*
   * Set the value of idusuarios
   * @param newVar the new value of idusuarios
   */
  public void setIdusuarios (int newVar) {
    idusuarios = newVar;
  }

  /*
   * Get the value of idusuarios
   * @return the value of idusuarios
   */
  public int getIdusuarios () {
    return idusuarios;
  }

  /*
   * Set the value of usuario
   * @param newVar the new value of usuario
   */
  public void setUsuario (String newVar) {
    usuario = newVar;
  }

  /*
   * Get the value of usuario
   * @return the value of usuario
   */
  public String getUsuario () {
    return usuario;
  }

  /*
   * Set the value of contrase�a
   * @param newVar the new value of contrase�a
   */
  public void setContraseña (String newVar) {
    contraseña = newVar;
  }

  /*
   * Get the value of contrase�a
   * @return the value of contrase�a
   */
  public String getContraseña () {
    return contraseña;
  }

  //
  // Other methods
  //

}
