package com.myorg.upcride.service.Implementacion;

import com.myorg.upcride.model.Itinerario;
import com.myorg.upcride.repository.ItinerarioRepository;
import com.myorg.upcride.service.ItinerarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItinerarioServiceImpl implements ItinerarioService {

    ItinerarioRepository itinerarioRepository;

    @Autowired
    public ItinerarioServiceImpl(ItinerarioRepository itinerarioRepository){
        this.itinerarioRepository = itinerarioRepository;
    }

    @Override
    public boolean insert(Itinerario t) throws Exception{
        return itinerarioRepository.insert(t);
    }

    @Override
    public boolean update(Itinerario t) throws Exception{
        return itinerarioRepository.update(t);
    }

    @Override
    public boolean delete(Itinerario t) throws Exception{
        return itinerarioRepository.delete(t);
    }

    @Override
    public List<Itinerario> list() throws Exception{
        return itinerarioRepository.list();
    }

    @Override
    public Itinerario listById(Itinerario t) throws Exception{
        return itinerarioRepository.listById(t);
    }

}
