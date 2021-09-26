package com.appBruce.appBruce.controllers;

import java.util.List;
import java.util.Optional;

import com.appBruce.appBruce.entities.Orden;

public interface OrdenController {
    public List<Orden> getOrdenes();
    public Optional<Orden> getOrdenById(Long id);
    public Orden addOrden(Orden orden);
    public String deleteOrden(Long id);
    public String updateOrden(Orden ordenNew);
}
