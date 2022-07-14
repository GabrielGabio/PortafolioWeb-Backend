
package com.ejemploLogin.controller;

import com.ejemploLogin.model.Presentacion;
import com.ejemploLogin.service.IPresentacionService;
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
@RequestMapping("/presentacion")
@CrossOrigin
public class PresentacionController {
    
    @Autowired
    IPresentacionService preServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/ver")
    public List<Presentacion> verPresentacion() {
        return preServ.verPresentacion();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void crearPresentacion(@RequestBody Presentacion enca) {
        preServ.crearPresentacion(enca);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarPresentacion(@PathVariable Long id) {
        preServ.buscarPresentacion(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/ver/{id}")
    public Presentacion buscarPresentacion(@PathVariable Long id) {
        return preServ.buscarPresentacion(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Presentacion editarPresentacion(@PathVariable Long id,
            @RequestParam String backImage,
            @RequestParam String imgProfile,
            @RequestParam String name,
            @RequestParam String study,
            @RequestParam String curse,
            @RequestParam String ubi) {
        
        Presentacion pre = preServ.buscarPresentacion(id);
        
        pre.setBackImage(backImage);
        pre.setCurse(curse);
        pre.setImgProfile(imgProfile);
        pre.setName(name);
        pre.setStudy(study);
        pre.setUbi(ubi);
        
        preServ.editarPresentacion(pre);
        return pre;
    }
    
}
