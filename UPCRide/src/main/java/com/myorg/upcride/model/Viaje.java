package com.myorg.upcride.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "viaje")
public class Viaje implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoViaje;

    @ManyToOne
    @JoinColumn(name = "codigoUsuarioConductor")
    private Usuario codigoUsuarioConductor;

    @Column (name = "descripcion", length = 500, nullable = false)
    private String descripcion;

    @Column(name = "pntPartida", length = 60, nullable = false)
    private String pntPartida;

    @Column(name = "pntDestino", length = 60, nullable = false)
    private String pntDestino;

    @Column (name = "horaPartida", nullable = false)
    private String horaPartida;

    @Column (name = "horaLlegada", nullable = false)
    private String horaLlegada;

    @Column (name = "entrada_salida", nullable = false)
    private int entrada_salida;

    @Column (name = "fechaViaje", nullable = false)
    private String fechaViaje;

    @Column (name = "dia", length = 20, nullable = false)
    private String dia;

    @Column (name = "estado", length = 60, nullable = true)
    private String estado;

    @Column (name = "visualizacionHabilitada", nullable = false)
    private int visualizacionHabilitada;

    public int getCodigoViaje() {
        return codigoViaje;
    }

    public void setCodigoViaje(int codigoViaje) {
        this.codigoViaje = codigoViaje;
    }

    public Usuario getCodigoUsuarioConductor() {
        return codigoUsuarioConductor;
    }

    public void setCodigoUsuarioConductor(Usuario codigoUsuarioConductor) {
        this.codigoUsuarioConductor = codigoUsuarioConductor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPntPartida() {
        return pntPartida;
    }

    public void setPntPartida(String pntPartida) {
        this.pntPartida = pntPartida;
    }

    public String getPntDestino() {
        return pntDestino;
    }

    public void setPntDestino(String pntDestino) {
        this.pntDestino = pntDestino;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getEntrada_salida() {
        return entrada_salida;
    }

    public void setEntrada_salida(int entrada_salida) {
        this.entrada_salida = entrada_salida;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getVisualizacionHabilitada() {
        return visualizacionHabilitada;
    }

    public void setVisualizacionHabilitada(int visualizacionHabilitada) {
        this.visualizacionHabilitada = visualizacionHabilitada;
    }


}
