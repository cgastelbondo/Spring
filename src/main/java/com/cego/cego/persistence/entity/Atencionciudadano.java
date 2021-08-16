package com.cego.cego.persistence.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "atencionciudadano", schema = "geolocalizacion")
public class Atencionciudadano {
    @Id
    @Column(name = "atencionciudadano_id")
    private Integer  idAtencionciudadano;
    @Column(name = "nombre_unidad_armda_nacional")
    private String nombreUnidad;
    @Column(name = "nombre_gestor")
    private String nombreGestor;
    @Column(name = "email_gestor")
    private String emailGestor;
    @Column(name = "direccion_unidad")
    private String direccionUnidad;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "departamento")
    private String departamento;

    public Integer getIdAtencionciudadano() {
        return idAtencionciudadano;
    }

    public void setIdAtencionciudadano(Integer idAtencionciudadano) {
        this.idAtencionciudadano = idAtencionciudadano;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public String getNombreGestor() {
        return nombreGestor;
    }

    public void setNombreGestor(String nombreGestor) {
        this.nombreGestor = nombreGestor;
    }

    public String getEmailGestor() {
        return emailGestor;
    }

    public void setEmailGestor(String emailGestor) {
        this.emailGestor = emailGestor;
    }

    public String getDireccionUnidad() {
        return direccionUnidad;
    }

    public void setDireccionUnidad(String direccionUnidad) {
        this.direccionUnidad = direccionUnidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
