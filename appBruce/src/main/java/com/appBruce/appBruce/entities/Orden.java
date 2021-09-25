package com.appBruce.appBruce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDENES")
public class Orden {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    Long id;
    
    @Column(name="ORDEN")
    String orden;

    @Column(name="APRENDIDA")
    String aprendida;

    @Column(name="Fecha")
    String fecha;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getAprendida() {
        return aprendida;
    }

    public void setAprendida(String aprendida) {
        this.aprendida = aprendida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



}
