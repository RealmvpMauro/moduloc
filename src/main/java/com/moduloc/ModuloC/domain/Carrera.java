
package com.moduloc.ModuloC.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Carrera {
    
    @Id
    private int car_id;
    private String car_nom;

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getCar_nom() {
        return car_nom;
    }

    public void setCar_nom(String car_nom) {
        this.car_nom = car_nom;
    }
    
    
}
