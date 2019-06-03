package com.myorg.upcride.repository.Implementacion;

import com.myorg.upcride.model.Solicitud;
import com.myorg.upcride.repository.SolicitudRepository;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Component
public class SolicitudRepositoryImpl implements SolicitudRepository {

   // @PersistenceContext
    //EntityManager em;

    @Override
    public boolean insert(Solicitud t) throws Exception{
       // em.persist(t);
        return true;
    }

    @Override
    public boolean update(Solicitud t) throws Exception{
        //em.merge(t);
        return true;
    }

    @Override
    public boolean delete(Solicitud t) throws Exception{
        //em.remove(t);
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Solicitud> list() throws Exception{
        List<Solicitud> solicitudes = new ArrayList<Solicitud>();

        //Query q = em.createQuery("SELECT s FROM solicitud s");

      //  solicitudes = (List<Solicitud>) q.getResultList();
        return solicitudes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Solicitud listById(Solicitud t) throws Exception{
        List<Solicitud> solicitudes = new ArrayList<Solicitud>();

      //  Query q = em.createQuery("SELECT s FROM solicitud s Where s.codigo = ?1");
       // q.setParameter(1, t.getCodigoSolicitud());

       // solicitudes = (List<Solicitud>) q.getResultList();
        return solicitudes!= null && !solicitudes.isEmpty() ? solicitudes.get(0) : new Solicitud();
    }

}
