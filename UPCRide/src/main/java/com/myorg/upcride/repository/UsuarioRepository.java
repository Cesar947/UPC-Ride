package com.myorg.upcride.repository;

import com.myorg.upcride.model.Solicitud;
import com.myorg.upcride.model.Usuario;
import com.myorg.upcride.model.Viaje;

import java.util.List;

public interface UsuarioRepository extends JPArepository<Usuario> {

    List<Usuario> listarPasajeros(Solicitud s, Viaje v) throws Exception;
}
