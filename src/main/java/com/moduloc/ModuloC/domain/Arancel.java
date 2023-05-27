
package com.moduloc.ModuloC.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Arancel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String arc_id;
    private double arc_mont;
    private String arc_nom;
    private Date arc_fini;
    private Date arc_fexp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArc_id() {
        return arc_id;
    }

    public void setArc_id(String arc_id) {
        this.arc_id = arc_id;
    }

    public double getArc_mont() {
        return arc_mont;
    }

    public void setArc_mont(double arc_mont) {
        this.arc_mont = arc_mont;
    }

    public String getArc_nom() {
        return arc_nom;
    }

    public void setArc_nom(String arc_nom) {
        this.arc_nom = arc_nom;
    }

    public Date getArc_fini() {
        return arc_fini;
    }

    public void setArc_fini(Date arc_fini) {
        this.arc_fini = arc_fini;
    }

    public Date getArc_fexp() {
        return arc_fexp;
    }

    public void setArc_fexp(Date arc_fexp) {
        this.arc_fexp = arc_fexp;
    }



}
