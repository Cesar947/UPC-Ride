package com.myorg.upcride.repository.Implementacion;

import com.myorg.upcride.model.Reseña;
import com.myorg.upcride.repository.ReseñaRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ReseñaRepositoryImpl implements ReseñaRepository {
    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager em;

    @Override
    public boolean insert(Reseña r) throws Exception {
        em.persist(r);
        return true;
    }

    @Override
    public boolean update(Reseña r) throws Exception{
        em.merge(r);
        return true;
    }

    @Override
    public boolean delete(Reseña r) throws Exception {
        em.remove(r);
        return true;
    }

    @Override
    public List<Reseña> list() throws Exception {
        List<Reseña> reseñas = new ArrayList<>();

        Query query = em.createQuery("SELECT r FROM Reseña r");

        reseñas = (List<Reseña>) query.getResultList();
        return reseñas;
    }

    @Override
    public Reseña listById(Reseña r) throws Exception {
        List<Reseña> reseñas = new ArrayList<Reseña>();

        Query query = em.createQuery("SELECT r FROM Reseña r WHERE u.codigo = ?1");
        query.setParameter(1, r.getCodigoResena());

        return reseñas != null && !reseñas.isEmpty() ? reseñas.get(0) : new Reseña();
    }
}
