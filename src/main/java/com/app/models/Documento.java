package com.app.models;

import java.util.Date;

public class Documento {
  
  private String nombre;
  private String descripcion;
  private String emisor;
  private Date fecha;

  public Documento(String nombre, String descripcion, String emisor, Date fecha) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.emisor = emisor;
    this.fecha = fecha;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getEmisor() {
    return emisor;
  }

  public void setEmisor(String emisor) {
    this.emisor = emisor;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }
  
}