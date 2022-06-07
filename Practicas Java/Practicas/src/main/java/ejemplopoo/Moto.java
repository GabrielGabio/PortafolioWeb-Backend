package ejemplopoo;

public class Moto extends Vehiculo{
    
    int cilindrada;

    public Moto() {
    }

    public Moto(int cilindrada, int num_registros, int cant_ruedas, String marca, String modelo) {
        super(num_registros, cant_ruedas, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

   
    
    
}
