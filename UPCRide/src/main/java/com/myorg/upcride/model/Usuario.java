package com.myorg.upcride.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//@Entity
//@Table (name= "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario{// implements Serializable {

  //  private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codigoUsuario;

   // @Column(name = "email", length = 50, nullable = false)
    private String email;

   // @Column(name = "contrasena", length = 40, nullable = false)
    private String contrasena;

   // @Column(name = "nombres", length = 60, nullable = false)
    private String nombres;

   // @Column(name = "apellidos", length = 60, nullable = true)
    private String apellidos;

   // @Column(name = "ubicacion", length = 100, nullable = false)
    private String ubicacion;

 //   @Column(name = "facebookID", length = 60, nullable = true)
    private String facebookID;

   // @Column(name = "telefono", length = 25, nullable = false)
    private String telefono;

  //  @ManyToOne
   // @JoinColumn(name = "codigoDistrito")
    private String distrito;

    //@Column(name = "rol")
    private int rol;

   // @Column(name = "licenciaConducir", length = 9, nullable = true)
    private String licenciaConducir;

   // @Column(name="sede", length = 20, nullable= false)
    private String sede;


    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigo) {
        this.codigoUsuario = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFacebookID() {
        return facebookID;
    }

    public void setFacebookID(String facebookID) {
        this.facebookID = facebookID;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }
}