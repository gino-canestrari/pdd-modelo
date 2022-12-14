package com.app.models;

public class Usuario {

  private String nombre;
  private String apellido;
  private String email;
  private String puesto;

  public Usuario(String nombre, String apellido, String email, String puesto) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.puesto = puesto;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPuesto() {
    return puesto;
  }

  public void setPuesto(String puesto) {
    this.puesto = puesto;
  }

}
