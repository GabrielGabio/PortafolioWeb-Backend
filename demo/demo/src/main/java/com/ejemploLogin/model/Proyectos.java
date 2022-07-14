package com.ejemploLogin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String fecha;
    private String comienzo;
    private String fin;
    private String about;
    private String titleUrlGitHub;
    private String urlGitHub;
    private String textUrlGitHub;
    private String titleUrlPortfolio;
    private String urlPortfolio;
    private String textUrlPortfolio;

    public Proyectos() {
    }

    public Proyectos(String name, String fecha, String comienzo, String fin, String about, String titleUrlGitHub, String urlGitHub, String textUrlGitHub, String titleUrlPortfolio, String urlPortfolio, String textUrlPortfolio) {
        this.name = name;
        this.fecha = fecha;
        this.comienzo = comienzo;
        this.fin = fin;
        this.about = about;
        this.titleUrlGitHub = titleUrlGitHub;
        this.urlGitHub = urlGitHub;
        this.textUrlGitHub = textUrlGitHub;
        this.titleUrlPortfolio = titleUrlPortfolio;
        this.urlPortfolio = urlPortfolio;
        this.textUrlPortfolio = textUrlPortfolio;
    }
    
    
}
