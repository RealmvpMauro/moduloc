
package com.moduloc.ModuloC.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Caja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String caj_term;
    private int caj_sed;
    private String caj_nom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaj_term() {
        return caj_term;
    }

    public void setCaj_term(String caj_term) {
        this.caj_term = caj_term;
    }

    public int getCaj_sed() {
        return caj_sed;
    }

    public void setCaj_sed(int caj_sed) {
        this.caj_sed = caj_sed;
    }

    public String getCaj_nom() {
        return caj_nom;
    }

    public void setCaj_nom(String caj_nom) {
        this.caj_nom = caj_nom;
    }


    
}
