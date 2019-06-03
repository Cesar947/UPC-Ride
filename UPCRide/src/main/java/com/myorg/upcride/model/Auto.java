package com.myorg.upcride.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "auto")
public class Auto implements Serializable{

    @Id
    @Column (name="placa", length = 50, nullable = false)
    private int placa;

    @Column (name="polizaSoat", length = 50 , nullable = false )
    private int polizaSoat;

    @Column (name="marca", length = 50 , nullable = false )
    private String marca;

    @Column (name="modelo", length = 50 , nullable = false )
    private String modelo;

    @Column (name="limitePersonas", length = 50 , nullable = false )
    private int limitePersonas;

    @Column (name="codigoUsuario", length = 50 , nullable = false )
    private Usuario codigoUsuario;



    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }


    public int getPolizaSoat() {
        return polizaSoat;
    }

    public void setPolizaSoat(int polizaSoat) {
        this.polizaSoat = polizaSoat;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getLimitePersonas() {
        return limitePersonas;
    }

    public void setLimitePersonas(int limitePersonas) {
        this.limitePersonas = limitePersonas;
    }

    public Usuario getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Usuario codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }





}