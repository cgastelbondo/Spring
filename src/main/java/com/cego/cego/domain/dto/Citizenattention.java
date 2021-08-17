package com.cego.cego.domain.dto;

import io.swagger.annotations.ApiModelProperty;

public class Citizenattention {
    @ApiModelProperty(notes="Identificador de atencion al ciudadano")
    private Integer atencionciudadanoId;
    @ApiModelProperty(notes="Nombre de la Unidad")
    private String nombreunidadId;
    @ApiModelProperty(notes="Nombre del Gestor")
    private String nombregestorId;
    @ApiModelProperty(notes="Email del Gestor")
    private String emailgestorId;
    @ApiModelProperty(notes="Direccion de la Unidad")
    private String direccionunidadId;
    @ApiModelProperty(notes="Ciudad de la Unidad")
    private String ciudadId;
    @ApiModelProperty(notes="Departamento de la Unidad")
    private String departamentoId;

    public Integer getAtencionciudadanoId() {
        return atencionciudadanoId;
    }

    public void setAtencionciudadanoId(Integer atencionciudadanoId) {
        this.atencionciudadanoId = atencionciudadanoId;
    }

    public String getNombreunidadId() {
        return nombreunidadId;
    }

    public void setNombreunidadId(String nombreunidadId) {
        this.nombreunidadId = nombreunidadId;
    }

    public String getNombregestorId() {
        return nombregestorId;
    }

    public void setNombregestorId(String nombregestorId) {
        this.nombregestorId = nombregestorId;
    }

    public String getEmailgestorId() {
        return emailgestorId;
    }

    public void setEmailgestorId(String emailgestorId) {
        this.emailgestorId = emailgestorId;
    }

    public String getDireccionunidadId() {
        return direccionunidadId;
    }

    public void setDireccionunidadId(String direccionunidadId) {
        this.direccionunidadId = direccionunidadId;
    }

    public String getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(String ciudadId) {
        this.ciudadId = ciudadId;
    }

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(String departamentoId) {
        this.departamentoId = departamentoId;
    }
}