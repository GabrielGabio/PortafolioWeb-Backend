package ejemplopoo;

public class Vehiculo {
    
    int num_registros;
    int cant_ruedas;
    String marca;
    String modelo;

    public Vehiculo() {
    }

    public Vehiculo(int num_registros, int cant_ruedas, String marca, String modelo) {
        this.num_registros = num_registros;
        this.cant_ruedas = cant_ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getNum_registros() {
        return num_registros;
    }

    public void setNum_registros(int num_registros) {
        this.num_registros = num_registros;
    }

    public int getCant_ruedas() {
        return cant_ruedas;
    }

    public void setCant_ruedas(int cant_ruedas) {
        this.cant_ruedas = cant_ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Moto{" + "num_registros=" + num_registros + ", cant_ruedas=" + cant_ruedas + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
    
    public void estacionar(){
        System.out.println("Estoy estacionando");
    }
}
