package com.appBruce.appBruce.service;

import java.util.List;
import java.util.Optional;

import com.appBruce.appBruce.entities.Orden;

public interface OrdenService {
    public List<Orden> findAllOrdenes();
    public Optional<Orden> findOrdenById(Long id);
    public Orden saveOrden(Orden ordenNew);
    public String deleteOrden(Long id);
    public String updateOrden(Orden ordenNew);
    
}
