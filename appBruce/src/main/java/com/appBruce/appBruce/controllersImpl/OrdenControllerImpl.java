package com.appBruce.appBruce.controllersImpl;

import java.util.List;
import java.util.Optional;

import com.appBruce.appBruce.controllers.OrdenController;
import com.appBruce.appBruce.entities.Orden;
import com.appBruce.appBruce.service.OrdenService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdenControllerImpl implements OrdenController{

    @Autowired
    OrdenService ordenService;
    
    @Override
    @RequestMapping(value="/ordenes", method=RequestMethod.GET)
    public List<Orden> getOrdenes() {
        
        return ordenService.findAllOrdenes();
    }

    @Override
    @RequestMapping(value="/ordenes/{id}", method=RequestMethod.GET)
    public Optional<Orden> getOrdenById(@PathVariable Long id) {

        return ordenService.findOrdenById(id);

    }

    
    @Override
    @RequestMapping(value="/ordenes/add", method=RequestMethod.POST)
    public Orden addOrden(Orden orden) {
        return ordenService.saveOrden(orden);
    
    }
    
    @Override
    @RequestMapping(value="/ordenes/delete/{id}", method=RequestMethod.GET)
    public String deleteOrden(Long id) {
        return ordenService.deleteOrden(id);
    }

    @Override
    @RequestMapping(value="/ordenes/update", method = RequestMethod.PATCH)
    public String updateOrden(Orden ordenNew) {
        return ordenService.updateOrden(ordenNew);
    }

}
