package com.myorg.upcride.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table (name = "resena")*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reseña{// implements Serializable{

    //private static final long serialVersionUID = 1L;

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoReseña;

   // @Column (name = "contenido", length = 120 , nullable = false)
    private String contenido;

   // @Column (name = "valoracion")
    private double valoracion;

    //@ManyToOne
  //  @JoinColumn (name = "codigoCliente")
    private Usuario codigoCliente;

    //@ManyToOne
    //@JoinColumn (name = "codigoConductor")
    private Usuario codigoConductor;

    public int getCodigoResena() {
        return codigoReseña;
    }

    public void setCodigoResena(int codigoResena) {
        this.codigoReseña = codigoResena;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public Usuario getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Usuario codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Usuario getCodigoConductor() {
        return codigoConductor;
    }

    public void setCodigoConductor(Usuario codigoConductor) {
        this.codigoConductor = codigoConductor;
    }


}
