package com.myorg.upcride.repository.Implementacion;

import com.myorg.upcride.model.Itinerario;
import com.myorg.upcride.repository.ItinerarioRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ItinerarioRepositoryImpl implements ItinerarioRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    public boolean insert(Itinerario t) throws Exception{
        em.persist(t);
        return true;
    }

    @Override
    public boolean update(Itinerario t) throws Exception{
        em.merge(t);
        return true;
    }

    @Override
    public boolean delete(Itinerario t) throws Exception{
        em.remove(t);
        return true;
    }


    @Override
    public List<Itinerario> list() throws Exception{
        List<Itinerario> itinerarios = new ArrayList<Itinerario>();

        Query q = em.createQuery("SELECT i FROM Itinerario i");

        itinerarios = (List<Itinerario>) q.getResultList();
        return itinerarios;
    }


    @Override
    public Itinerario listById(Itinerario t) throws Exception{
        /*List<Itinerario> itinerarios = new ArrayList<Itinerario>();

        Query q = em.createQuery("SELECT i FROM itinerario i Where i.codigo = ?1");
        q.setParameter(1, t());

        itinerarios = (List<Solicitud>) q.getResultList();
        return itinerarios!= null && !solicitudes.isEmpty() ? solicitudes.get(0) : new Solicitud();*/

        Itinerario x = new Itinerario();
        return x;
    }

    @Override
    public  Itinerario listByPK(Itinerario t) throws Exception{
        List<Itinerario> itinerarios = new ArrayList<Itinerario>();

        Query q = em.createQuery("SELECT i FROM itinerario i Where i.hora = ?1 AND i.dia = ?2 AND i.codigoUsuario = ?3");
        q.setParameter(1, t.getCodigoItinerario().getHora());
        q.setParameter(2, t.getCodigoItinerario().getDia());
        q.setParameter(3, t.getCodigoItinerario().getCodigoUsuario());

        itinerarios = (List<Itinerario>) q.getResultList();
        return itinerarios!= null && !itinerarios.isEmpty() ? itinerarios.get(0) : new Itinerario();
    }

}

