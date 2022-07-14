
package com.ejemploLogin.controller;

import com.ejemploLogin.model.Educacion;
import com.ejemploLogin.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educacion")
@CrossOrigin
public class EducacionController {
    
    @Autowired
    IEducacionService eduServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/ver")
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void crearEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarPresentacion(@PathVariable Long id) {
        eduServ.buscarEducacion(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/ver/{id}")
    public Educacion buscarPresentacion(@PathVariable Long id) {
        return eduServ.buscarEducacion(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Educacion editarPresentacion(@PathVariable Long id,
            @RequestParam("school") String school,
            @RequestParam("title") String title,
            @RequestParam("comienzo") String comienzo,
            @RequestParam("fin") String fin,
            @RequestParam("img") String img,
            @RequestParam("enlace") String enlace) {
        
        Educacion edu = eduServ.buscarEducacion(id);
        
        edu.setSchool(school);
        edu.setTitle(title);
        edu.setComienzo(comienzo);
        edu.setFin(fin);
        edu.setImg(img);
        edu.setEnlace(enlace);
        
        eduServ.editarEducacion(edu);
        return edu;
    }
}
