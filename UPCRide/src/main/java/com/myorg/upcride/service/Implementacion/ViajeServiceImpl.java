package com.myorg.upcride.service.Implementacion;

import com.myorg.upcride.model.Viaje;
import com.myorg.upcride.repository.ViajeRepository;
import com.myorg.upcride.service.ViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajeServiceImpl implements ViajeService {

    ViajeRepository viajeRepository;

    @Autowired
    public ViajeServiceImpl(ViajeRepository viajeRepository){
        this.viajeRepository = viajeRepository;
    }

    public boolean insert(Viaje t) throws Exception{
        return viajeRepository.insert(t);
    }
    public boolean update(Viaje t) throws Exception{
        return viajeRepository.update(t);
    }
    public boolean delete(Viaje t) throws Exception{
        return viajeRepository.delete(t);
    }
    public List<Viaje> list() throws Exception{
        return viajeRepository.list();
    }
    public Viaje listById(Viaje t) throws Exception{
        return viajeRepository.listById(t);
    }
}

