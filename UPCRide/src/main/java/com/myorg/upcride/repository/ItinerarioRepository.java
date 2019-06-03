package com.myorg.upcride.repository;

import com.myorg.upcride.model.Itinerario;

public interface ItinerarioRepository extends JPArepository<Itinerario> {
    Itinerario listByPK(Itinerario itinerario) throws Exception;
}
