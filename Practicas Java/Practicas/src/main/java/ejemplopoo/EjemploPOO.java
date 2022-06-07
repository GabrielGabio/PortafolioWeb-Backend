package ejemplopoo;

/**
 *
 * @author Gabri
 */
public class EjemploPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vehiculo vehi = new Vehiculo(123141, 4, "Audi", "Q5");
        Auto auto1 = new Auto();
        Auto auto2 = new Auto(1, "AA191BB", 5, "Rojo", true, 23, 4, "Peugeot", "207 Compact");
        Moto moto1 = new Moto(600, 1231, 2, "Zanella", "600 JA");
        Camion camion1 = new Camion(2, true, 123, 6, "Mercedez", "1114");

        System.out.println("Auto 2: ");
        auto2.encender();
        auto2.acelerar(15);
        auto2.frenar(10);
        auto2.apagar();

        System.out.println("La id de auto2 es: " + auto2.getId());
        System.out.println("El color del auto2 es: " + auto2.getColor());

        System.out.println("--------------");

        auto1.setId(1500);
        auto1.setColor("verde");
        auto1.setCaja_manual(false);
        auto1.setCant_puertas(3);
        auto1.setPatente("AB569PO");

        System.out.println("La id de auto1 es: " + auto1.getId());
        System.out.println("El nuevo color del auto1 es: " + auto1.getColor());

        System.out.println("-----------");

        System.out.println(auto1.toString());
        System.out.println(auto2.toString());

        System.out.println("----------");

        Vehiculo vector[] = new Vehiculo[4];
        vector[0] = vehi;
        vector[1] = auto2;
        vector[2] = moto1;
        vector[3] = camion1;

        for (int i = 0; i < 4; i++) {
            System.out.println("Registro N°: " + i + " " + vector[i].getMarca());
        }

    }

}
