package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    PersonaJpaController persJPA = new PersonaJpaController();

    public void crearPersona(Persona per) {
        persJPA.create(per);

    }

    public void eliminarPersona(int id) {
        try {
            persJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPersona(Persona per) {
        try {
            persJPA.destroy(per.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Persona> traerPersona() {
        return persJPA.findPersonaEntities();
    }
    
    public Persona encontrarPersona(int id){
        return persJPA.findPersona(id);
    }
    
    public void editarPersona(Persona per){
        try {
            persJPA.edit(per);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
}
