

/**
 * Class domicilio
 */
public class domicilio {

  //
  // Fields
  //

  public String idDomicilio;
  private String calle;
  private String barrio;
  private String localidad;
  private String provincia;
  private String pais;
  private Persona* new_attribute;
  
  //
  // Constructors
  //
  public domicilio () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of idDomicilio
   * @param newVar the new value of idDomicilio
   */
  public void setIdDomicilio (String newVar) {
    idDomicilio = newVar;
  }

  /**
   * Get the value of idDomicilio
   * @return the value of idDomicilio
   */
  public String getIdDomicilio () {
    return idDomicilio;
  }

  /**
   * Set the value of calle
   * @param newVar the new value of calle
   */
  public void setCalle (String newVar) {
    calle = newVar;
  }

  /**
   * Get the value of calle
   * @return the value of calle
   */
  public String getCalle () {
    return calle;
  }

  /**
   * Set the value of barrio
   * @param newVar the new value of barrio
   */
  public void setBarrio (String newVar) {
    barrio = newVar;
  }

  /**
   * Get the value of barrio
   * @return the value of barrio
   */
  public String getBarrio () {
    return barrio;
  }

  /**
   * Set the value of localidad
   * @param newVar the new value of localidad
   */
  public void setLocalidad (String newVar) {
    localidad = newVar;
  }

  /**
   * Get the value of localidad
   * @return the value of localidad
   */
  public String getLocalidad () {
    return localidad;
  }

  /**
   * Set the value of provincia
   * @param newVar the new value of provincia
   */
  public void setProvincia (String newVar) {
    provincia = newVar;
  }

  /**
   * Get the value of provincia
   * @return the value of provincia
   */
  public String getProvincia () {
    return provincia;
  }

  /**
   * Set the value of pais
   * @param newVar the new value of pais
   */
  public void setPais (String newVar) {
    pais = newVar;
  }

  /**
   * Get the value of pais
   * @return the value of pais
   */
  public String getPais () {
    return pais;
  }

  /**
   * Set the value of new_attribute
   * @param newVar the new value of new_attribute
   */
  public void setNew_attribute (Persona* newVar) {
    new_attribute = newVar;
  }

  /**
   * Get the value of new_attribute
   * @return the value of new_attribute
   */
  public Persona* getNew_attribute () {
    return new_attribute;
  }

  //
  // Other methods
  //

}
