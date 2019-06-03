package com.myorg.upcride.repository.Implementacion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.myorg.upcride.model.Auto;
import com.myorg.upcride.repository.AutoRepository;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;



@Component
public class AutoRepositoryImpl implements AutoRepository, Serializable {

    //private static final long serialVersionUID = 1L;
//
   // @PersistenceContext
   // private EntityManager em;


    @Override
    public boolean insert(Auto u) throws Exception{
      //  em.persist(u);
        return true;
    }

    @Override
    public boolean update(Auto u) throws Exception{
       // em.merge(u);
        return true;
    }

    @Override
    public boolean delete(Auto u) throws Exception{
        //em.remove(u);
        return true;
    }
    @Override
    public List<Auto> list() throws Exception{
        List<Auto> autos = new ArrayList<Auto>();
       // Query q = em.createQuery("Select u from auto u ");
      //  autos = (List<Auto>) q.getResultList();
        return autos;
    }

    @Override
    public Auto listById(Auto u) throws Exception{
        List<Auto> autos = new ArrayList<>();
     //   Query q = em.createQuery("Select from auto u where u.placa = ?1");
       // q.setParameter(1, u.getPlaca());
       // autos = (List<Auto>) q.getResultList();
        return autos != null && !autos.isEmpty() ? autos.get(0) : new Auto();
    }
}