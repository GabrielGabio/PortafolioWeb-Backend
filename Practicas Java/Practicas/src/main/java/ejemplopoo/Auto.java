package ejemplopoo;

/**
 *
 * @author Gabri
 */
public class Auto extends Vehiculo{
    
    // Declarando atributos
    private int id;
    private String patente;
    private int cant_puertas;
    private String color;
    private boolean caja_manual;
    
//    Constructores

    public Auto() {
    }

    public Auto(int id, String patente, int cant_puertas, String color, boolean caja_manual, int num_registros, int cant_ruedas, String marca, String modelo) {
        super(num_registros, cant_ruedas, marca, modelo);
        this.id = id;
        this.patente = patente;
        this.cant_puertas = cant_puertas;
        this.color = color;
        this.caja_manual = caja_manual;
    }

    
    
//    Metodos 
    
    public void encender(){
        System.out.println("Estoy encendiendo");
    }
    
    public void acelerar(double km){
        System.out.println("Estoy acelerando " + km + " kms.");
    }
    
    public void frenar(double km){
        System.out.println("Estoy frenando " + km + " kms.");
    }
    
    public void apagar(){
        System.out.println("Estoy apagando");
    }
    
//    Get and Seters 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCant_puertas() {
        return cant_puertas;
    }

    public void setCant_puertas(int cant_puertas) {
        this.cant_puertas = cant_puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCaja_manual() {
        return caja_manual;
    }

    public void setCaja_manual(boolean caja_manual) {
        this.caja_manual = caja_manual;
    }
    
//    ToString

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", patente=" + patente + ", cant_puertas=" + cant_puertas + ", color=" + color + ", caja_manual=" + caja_manual + '}';
    }
    
}
