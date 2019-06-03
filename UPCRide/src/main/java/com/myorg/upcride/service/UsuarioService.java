package com.myorg.upcride.service;

import com.myorg.upcride.model.Solicitud;
import com.myorg.upcride.model.Usuario;
import com.myorg.upcride.model.Viaje;

import java.util.List;

public interface UsuarioService extends CRUDservice<Usuario>{
    List<Usuario> listarPasajeros(Solicitud s, Viaje v) throws Exception;
}
