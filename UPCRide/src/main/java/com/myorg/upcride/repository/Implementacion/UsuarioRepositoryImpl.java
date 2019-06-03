package com.myorg.upcride.repository.Implementacion;

import com.myorg.upcride.model.Solicitud;
import com.myorg.upcride.model.Usuario;
import com.myorg.upcride.model.Viaje;
import com.myorg.upcride.repository.UsuarioRepository;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Component
public class UsuarioRepositoryImpl implements UsuarioRepository {

   // @PersistenceContext
   // private EntityManager em;
    @Override
    public boolean insert(Usuario u) throws Exception{
       // em.persist(u);
        return true;
    }
    @Override
    public boolean update(Usuario u) throws Exception{
        //em.merge(u);
        return true;
    }
    @Override
    public boolean delete(Usuario u) throws Exception{
       // em.remove(u);
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Usuario> list() throws Exception{
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("U201710947",
                "U201710947@gmail.com",
                "xdxdxd5000",
                "César Alejandro",
                "Pizarro Llanos",
                "sdfgasdgsdgsdgsdsag",
                null,
                "999999999",
                "Magdalena del Mar",
                0,
                null,
                "San Miguel"));
        /*Query q = em.createQuery("SELECT u FROM usuario u");
        usuarios = (List<Usuario>) q.getResultList();*/
        return usuarios;
    }
    @SuppressWarnings("unchecked")
    @Override
    public Usuario listById(Usuario u) throws Exception {
        List<Usuario> usuarios = new ArrayList<>();

//        Query q = em.createQuery("SELECT u FROM usuario u WHERE u.codigo = ?1");
//        q.setParameter(1, u.getCodigoUsuario());

        return usuarios != null && !usuarios.isEmpty() ? usuarios.get(0) : new Usuario();
    }
    @Override
    public List<Usuario> listarPasajeros(Solicitud s, Viaje v) throws Exception{
        List<Usuario> usuarios = new ArrayList<>();
//        Query q = em.createQuery("SELECT u FROM usuario u JOIN solicitud s ON u.codigoUsuario = s.codigoCliente JOIN viaje v ON v.codigoViaje = s.codigoViaje where "+
//                "u.rol = ?1");
//        q.setParameter(1, 0);
//        usuarios = (List<Usuario>) q.getResultList();
        return usuarios;
    }

}
