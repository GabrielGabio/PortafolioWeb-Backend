package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearPersona(Persona per) {
        controlPersis.crearPersona(per);
    }

    public void eliminarPersona(int id) {
        controlPersis.eliminarPersona(id);
    }

    public void eliminarPersona(Persona per) {
        controlPersis.eliminarPersona(per);
    }

    public List<Persona> traerPersona() {
        return controlPersis.traerPersona();
    }

    public void editarPersona(Persona per) {
        controlPersis.editarPersona(per);
    }

    public Persona encontrarPersona(int id) {
        return controlPersis.encontrarPersona(id);
    }

    

}
