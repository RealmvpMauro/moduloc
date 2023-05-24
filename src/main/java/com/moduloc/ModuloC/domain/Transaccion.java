
package com.moduloc.ModuloC.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String trc_nom;
    private String trc_trn;
    private String trc_numc;
    private double trc_mont;
    private String trc_mond;
    private double trc_tipc;
    private double trc_conv;
    private String trc_pag;
    private String trc_norc;
    private Date trc_fech;
    private double trc_totl;
    private String trc_desc;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrc_nom() {
        return trc_nom;
    }

    public void setTrc_nom(String trc_nom) {
        this.trc_nom = trc_nom;
    }

    public String getTrc_trn() {
        return trc_trn;
    }

    public void setTrc_trn(String trc_trn) {
        this.trc_trn = trc_trn;
    }

    public String getTrc_numc() {
        return trc_numc;
    }

    public void setTrc_numc(String trc_numc) {
        this.trc_numc = trc_numc;
    }

    public double getTrc_mont() {
        return trc_mont;
    }

    public void setTrc_mont(double trc_mont) {
        this.trc_mont = trc_mont;
    }

    public String getTrc_mond() {
        return trc_mond;
    }

    public void setTrc_mond(String trc_mond) {
        this.trc_mond = trc_mond;
    }

    public double getTrc_tipc() {
        return trc_tipc;
    }

    public void setTrc_tipc(double trc_tipc) {
        this.trc_tipc = trc_tipc;
    }

    public double getTrc_conv() {
        return trc_conv;
    }

    public void setTrc_conv(double trc_conv) {
        this.trc_conv = trc_conv;
    }

    public String getTrc_pag() {
        return trc_pag;
    }

    public void setTrc_pag(String trc_pag) {
        this.trc_pag = trc_pag;
    }

    public String getTrc_norc() {
        return trc_norc;
    }

    public void setTrc_norc(String trc_norc) {
        this.trc_norc = trc_norc;
    }

    public Date getTrc_fech() {
        return trc_fech;
    }

    public void setTrc_fech(Date trc_fech) {
        this.trc_fech = trc_fech;
    }

    public double getTrc_totl() {
        return trc_totl;
    }

    public void setTrc_totl(double trc_totl) {
        this.trc_totl = trc_totl;
    }

    public String getTrc_desc() {
        return trc_desc;
    }

    public void setTrc_desc(String trc_desc) {
        this.trc_desc = trc_desc;
    }



}
