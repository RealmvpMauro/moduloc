
package com.moduloc.ModuloC.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;


@Entity
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nom;
    private String apel;
    private String no_ctn;
    private String ano_ac;
    private Long carreraID;
    private String modld;
    private String turn;
    private String sex;
    private String estd_c;
    private String lug_nac;
    private String dob;
    private String procd;
    private String no_ced;
    private String dir_dom;
    private String telf_per;
    private String email;
    private String relg;
    private String lug_trb;
    private String telf_trb;
    private String nom_cony;
    private String nom_pad;
    private String nom_mad;
    private String col_prim;
    private String col_sec;
    private String col_fech;
    private String col_otro;
    private String col_univ;
    private Boolean col_dipl;
    private Boolean col_nota;
    private Boolean doc_ced;
    private Boolean doc_part;
    private Boolean doc_foto;
    private Boolean doc_mined;
    private Boolean doc_ftit;
    private Boolean doc_extr;
    private String doc_otro;

    @OneToMany(mappedBy = "estudiante")
    private List<Transaccion> transaccion;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApel() {
        return apel;
    }

    public void setApel(String apel) {
        this.apel = apel;
    }

    public String getNo_ctn() {
        return no_ctn;
    }

    public void setNo_ctn(String no_ctn) {
        this.no_ctn = no_ctn;
    }

    public String getAno_ac() {
        return ano_ac;
    }

    public void setAno_ac(String ano_ac) {
        this.ano_ac = ano_ac;
    }

    public Long getCarreraID() {
        return carreraID;
    }

    public void setCarreraID(Long carreraID) {
        this.carreraID = carreraID;
    }

    public String getModld() {
        return modld;
    }

    public void setModld(String modld) {
        this.modld = modld;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEstd_c() {
        return estd_c;
    }

    public void setEstd_c(String estd_c) {
        this.estd_c = estd_c;
    }

    public String getLug_nac() {
        return lug_nac;
    }

    public void setLug_nac(String lug_nac) {
        this.lug_nac = lug_nac;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getProcd() {
        return procd;
    }

    public void setProcd(String procd) {
        this.procd = procd;
    }

    public String getNo_ced() {
        return no_ced;
    }

    public void setNo_ced(String no_ced) {
        this.no_ced = no_ced;
    }

    public String getDir_dom() {
        return dir_dom;
    }

    public void setDir_dom(String dir_dom) {
        this.dir_dom = dir_dom;
    }

    public String getTelf_per() {
        return telf_per;
    }

    public void setTelf_per(String telf_per) {
        this.telf_per = telf_per;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRelg() {
        return relg;
    }

    public void setRelg(String relg) {
        this.relg = relg;
    }

    public String getLug_trb() {
        return lug_trb;
    }

    public void setLug_trb(String lug_trb) {
        this.lug_trb = lug_trb;
    }

    public String getTelf_trb() {
        return telf_trb;
    }

    public void setTelf_trb(String telf_trb) {
        this.telf_trb = telf_trb;
    }

    public String getNom_cony() {
        return nom_cony;
    }

    public void setNom_cony(String nom_cony) {
        this.nom_cony = nom_cony;
    }

    public String getNom_pad() {
        return nom_pad;
    }

    public void setNom_pad(String nom_pad) {
        this.nom_pad = nom_pad;
    }

    public String getNom_mad() {
        return nom_mad;
    }

    public void setNom_mad(String nom_mad) {
        this.nom_mad = nom_mad;
    }

    public String getCol_prim() {
        return col_prim;
    }

    public void setCol_prim(String col_prim) {
        this.col_prim = col_prim;
    }

    public String getCol_sec() {
        return col_sec;
    }

    public void setCol_sec(String col_sec) {
        this.col_sec = col_sec;
    }

    public String getCol_fech() {
        return col_fech;
    }

    public void setCol_fech(String col_fech) {
        this.col_fech = col_fech;
    }

    public String getCol_otro() {
        return col_otro;
    }

    public void setCol_otro(String col_otro) {
        this.col_otro = col_otro;
    }

    public String getCol_univ() {
        return col_univ;
    }

    public void setCol_univ(String col_univ) {
        this.col_univ = col_univ;
    }

    public Boolean getCol_dipl() {
        return col_dipl;
    }

    public void setCol_dipl(Boolean col_dipl) {
        this.col_dipl = col_dipl;
    }

    public Boolean getCol_nota() {
        return col_nota;
    }

    public void setCol_nota(Boolean col_nota) {
        this.col_nota = col_nota;
    }

    public Boolean getDoc_ced() {
        return doc_ced;
    }

    public void setDoc_ced(Boolean doc_ced) {
        this.doc_ced = doc_ced;
    }

    public Boolean getDoc_part() {
        return doc_part;
    }

    public void setDoc_part(Boolean doc_part) {
        this.doc_part = doc_part;
    }

    public Boolean getDoc_foto() {
        return doc_foto;
    }

    public void setDoc_foto(Boolean doc_foto) {
        this.doc_foto = doc_foto;
    }

    public Boolean getDoc_mined() {
        return doc_mined;
    }

    public void setDoc_mined(Boolean doc_mined) {
        this.doc_mined = doc_mined;
    }

    public Boolean getDoc_ftit() {
        return doc_ftit;
    }

    public void setDoc_ftit(Boolean doc_ftit) {
        this.doc_ftit = doc_ftit;
    }

    public Boolean getDoc_extr() {
        return doc_extr;
    }

    public void setDoc_extr(Boolean doc_extr) {
        this.doc_extr = doc_extr;
    }

    public String getDoc_otro() {
        return doc_otro;
    }

    public void setDoc_otro(String doc_otro) {
        this.doc_otro = doc_otro;
    }


}
