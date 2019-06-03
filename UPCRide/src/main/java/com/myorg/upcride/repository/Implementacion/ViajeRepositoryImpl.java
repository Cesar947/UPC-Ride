package com.myorg.upcride.repository.Implementacion;

import com.myorg.upcride.model.Viaje;
import com.myorg.upcride.repository.ViajeRepository;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;

/*import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;*/
import java.util.ArrayList;
import java.util.List;

@Component
public class ViajeRepositoryImpl implements ViajeRepository {

    //@PersistenceContext
   // EntityManager em;

    @Override
    public boolean insert(Viaje t) throws Exception{
       // em.persist(t);
        return true;
    }

    @Override
    public boolean update(Viaje t) throws Exception{
       // em.merge(t);
        return true;
    }

    @Override
    public boolean delete(Viaje t) throws Exception{
       // em.remove(t);
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Viaje> list() throws Exception{
        List<Viaje> viajes = new ArrayList<Viaje>();

        //Query q = em.createQuery("SELECT v FROM viaje v");

       // viajes = (List<Viaje>) q.getResultList();
        return viajes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Viaje listById(Viaje t) throws Exception{
        List<Viaje> viajes = new ArrayList<Viaje>();

        //Query q = em.createQuery("SELECT v FROM viaje v Where v.codigoViaje = ?1");
      //  q.setParameter(1, t.getCodigoViaje());

       // viajes = (List<Viaje>) q.getResultList();
        return viajes!= null && !viajes.isEmpty() ? viajes.get(0) : new Viaje();
    }
}

