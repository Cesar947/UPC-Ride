package com.myorg.upcride.service.Implementacion;

import com.myorg.upcride.model.Solicitud;
import com.myorg.upcride.model.Usuario;
import com.myorg.upcride.model.Viaje;
import com.myorg.upcride.repository.UsuarioRepository;
import com.myorg.upcride.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }


    public boolean insert(Usuario u) throws Exception{
        return usuarioRepository.insert(u);
    }
    public boolean update(Usuario u) throws Exception{
        return usuarioRepository.update(u);
    }
    public boolean delete(Usuario u) throws Exception{
        return usuarioRepository.delete(u);
    }
    public List<Usuario> list() throws Exception{
        return usuarioRepository.list();
    }
    public Usuario listById(Usuario u) throws Exception{
        return usuarioRepository.listById(u);
    }
    public List<Usuario> listarPasajeros(Solicitud s, Viaje v) throws Exception{
        return usuarioRepository.listarPasajeros(s,v);
    }
}
