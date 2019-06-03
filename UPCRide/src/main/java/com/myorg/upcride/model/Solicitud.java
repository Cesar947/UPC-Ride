package com.myorg.upcride.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;

/**
 *
 * @author slayz
 */

/*@Entity
@Table(name = "solicitud")*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Solicitud {//implements Serializable {

   // private static final long serialVersionUID = 1L;

   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private int codigoSolicitud;

   /* @ManyToOne
    @JoinColumn(name = "codigoCliente")*/
    private Usuario codigoCliente;

    /*@ManyToOne
    @JoinColumn(name ="codigoViaje")*/
    private Viaje codigoViaje;

 /*   @Column(name = "mensajeSolicitud", length = 120, nullable = true)*/
    private String mensaje;

 //   @Column(name="confirmacionConductor", length = 9, nullable = true)
    private boolean confirmacionConductor;


   // @Column(name="puntoRecojo", length = 30, nullable = true)
    private String puntoRecojo;

    public int getCodigoSolicitud() {
        return codigoSolicitud;
    }

    public void setCodigoSolicitud(int codigo) {
        this.codigoSolicitud = codigo;
    }

    public Usuario getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Usuario codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Viaje getCodigoViaje() {
        return codigoViaje;
    }

    public void setCodigoViaje(Viaje codigoViaje) {
        this.codigoViaje = codigoViaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean getConfirmacionConductor() {
        return confirmacionConductor;
    }

    public void setConfirmacionConductor(boolean confirmacionConductor) {
        this.confirmacionConductor = confirmacionConductor;
    }



    public String getPuntoRecojo() {
        return puntoRecojo;
    }

    public void setPuntoRecojo(String puntoRecojo) {
        this.puntoRecojo = puntoRecojo;
    }


}
