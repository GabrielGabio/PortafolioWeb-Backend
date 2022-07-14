
package com.ejemploLogin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Aptitudes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String  progress;
    private int valor;
    private String valorALF;
    private String color;

    public Aptitudes() {
    }

    public Aptitudes(String name, String progress, int valor, String valorALF, String color) {
        this.name = name;
        this.progress = progress;
        this.valor = valor;
        this.valorALF = valorALF;
        this.color = color;
    }
    
    
}
