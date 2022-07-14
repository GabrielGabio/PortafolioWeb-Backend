package com.ejemploLogin.controller;

import com.ejemploLogin.model.Aptitudes;
import com.ejemploLogin.service.IAptitudesService;
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
@RequestMapping("/aptitudes")
@CrossOrigin
public class AptitudesController {
    
    @Autowired
    IAptitudesService aptServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/ver")
    public List<Aptitudes> verAptitudes() {
        return aptServ.verAptitudes();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void crearAptitudes(@RequestBody Aptitudes apt) {
        aptServ.crearAptitudes(apt);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarAptitudes(@PathVariable Long id) {
        aptServ.buscarAptitudes(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/ver/{id}")
    public Aptitudes buscarAptitudes(@PathVariable Long id) {
        return aptServ.buscarAptitudes(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Aptitudes editarAptitudes(@PathVariable Long id,
            @RequestParam("name") String name,
            @RequestParam("progress") String progress,
            @RequestParam("valor") int valor,
            @RequestParam("valorALF") String valorALF,
            @RequestParam("color") String color) {
        
        Aptitudes apt = aptServ.buscarAptitudes(id);
        
        apt.setName(name);
        apt.setProgress(progress);
        apt.setValor(valor);
        apt.setValorALF(valorALF);
        apt.setColor(color);
        
        aptServ.editarAptitudes(apt);
        return apt;
    }
}
