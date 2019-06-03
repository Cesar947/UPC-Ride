package com.myorg.upcride.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "itinerario")
public class Itinerario implements Serializable{

    @EmbeddedId
    private ItinerarioId codigoItinerario;

    @Column (name="entrada_salida", length = 50 , nullable = false )
    private boolean entrada_salida;

    @Column (name="ubicacionPartida", length = 50 , nullable = false )
    private String ubicacionPartida;

    @Column (name="ubicacionDestino", length = 50 , nullable = false )
    private String ubicacionDestino;


    public ItinerarioId getCodigoItinerario() {
        return codigoItinerario;
    }

    public void setCodigoItinerario(ItinerarioId codigoItinerario) {
        this.codigoItinerario = codigoItinerario;
    }

    public boolean isEntrada_salida() {
        return entrada_salida;
    }

    public void setEntrada_salida(boolean entrada_salida) {
        this.entrada_salida = entrada_salida;
    }

    public String getUbicacionPartida() {
        return ubicacionPartida;
    }

    public void setUbicacionPartida(String ubicacionPartida) {
        this.ubicacionPartida = ubicacionPartida;
    }

    public String getUbicacionDestino() {
        return ubicacionDestino;
    }

    public void setUbicacionDestino(String ubicacionDestino) {
        this.ubicacionDestino = ubicacionDestino;
    }





}
