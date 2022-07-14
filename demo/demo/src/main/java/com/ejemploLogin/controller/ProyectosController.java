package com.ejemploLogin.controller;

import com.ejemploLogin.model.Proyectos;
import com.ejemploLogin.service.IProyectosService;
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
@RequestMapping("/proyectos")
@CrossOrigin
public class ProyectosController {

    @Autowired
    IProyectosService proServ;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/ver")
    public List<Proyectos> verProyectos() {
        return proServ.verProyectos();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void crearProyectos(@RequestBody Proyectos pro) {
        proServ.crearProyectos(pro);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarProyectos(@PathVariable Long id) {
        proServ.buscarProyectos(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/ver/{id}")
    public Proyectos buscarProyectos(@PathVariable Long id) {
        return proServ.buscarProyectos(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Proyectos editarProyectos(@PathVariable Long id,
            @RequestParam("name") String name,
            @RequestParam("fecha") String fecha,
            @RequestParam("comienzo") String comienzo,
            @RequestParam("fin") String fin,
            @RequestParam("about") String about,
            @RequestParam("titleUrlGitHub") String titleUrlGitHub,
            @RequestParam("urlGitHub") String urlGitHub,
            @RequestParam("textUrlGitHub") String textUrlGitHub,
            @RequestParam("titleUrlPortfolio") String titleUrlPortfolio,
            @RequestParam("urlPortfolio") String urlPortfolio,
            @RequestParam("textUrlPortfolio") String textUrlPortfolio){

        Proyectos pro = proServ.buscarProyectos(id);

        pro.setName(name);
        pro.setFecha(fecha);
        pro.setComienzo(comienzo);
        pro.setFin(fin);
        pro.setAbout(about);
        pro.setTitleUrlGitHub(titleUrlGitHub);
        pro.setUrlGitHub(urlGitHub);
        pro.setTextUrlGitHub(textUrlGitHub);
        pro.setTitleUrlPortfolio(titleUrlPortfolio);
        pro.setUrlPortfolio(urlPortfolio);
        pro.setTextUrlPortfolio(textUrlPortfolio);

        proServ.editarProyectos(pro);
        return pro;
    }
}
