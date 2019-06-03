package com.myorg.upcride.model;

//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

//@Embeddable

public class ItinerarioId {

    //@Column (name="hora", length = 50, nullable = false)
    private String hora;

    //@Column (name="dia", length = 50 , nullable = false )
    private String dia;

    //@ManyToOne
    //@JoinColumn(name = "codigoUsuario")
    private Usuario codigoUsuario;

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Usuario getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Usuario codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItinerarioId)) return false;
        ItinerarioId that = (ItinerarioId) o;
        return getHora().equals(that.getHora()) &&
                getDia().equals(that.getDia()) &&
                getCodigoUsuario().equals(that.getCodigoUsuario());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHora(), getDia(), getCodigoUsuario());
    }
}
