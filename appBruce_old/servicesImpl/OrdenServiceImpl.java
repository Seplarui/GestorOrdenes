package com.appBruce.appBruce.servicesImpl;

import java.util.List;
import java.util.Optional;

import com.appBruce.appBruce.entities.Orden;
import com.appBruce.appBruce.repository.OrdenRepository;
import com.appBruce.appBruce.service.OrdenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenServiceImpl implements OrdenService{
    @Autowired
    OrdenRepository ordenRepository;

    @Override
    public List<Orden> findAllOrdenes(){
        return ordenRepository.findAll();
    }

    @Override 
    public Optional<Orden> findOrdenById(Long id) {
        Optional<Orden> orden = ordenRepository.findById(id);

        return orden;
    }

    @Override
    public Orden saveOrden(Orden ordenNew) {
        if(ordenNew != null) {
            return ordenRepository.save(ordenNew);
        }
        return new Orden();
    }

    public String deleteOrden(Long id) {
        if(ordenRepository.findById(id).isPresent()) {
            ordenRepository.deleteById(id);
            return "Orden eliminada correctamente";
        }

        return "¡Error! No se ha podido eliminar la orden";
    }

    public String updateOrden(Orden ordenUpdated) {
        Long num = ordenUpdated.getId();

        if(ordenRepository.findById(num).isPresent()) {
            Orden ordenToUpdate = new Orden();
            ordenToUpdate.setId(ordenUpdated.getId());
            ordenToUpdate.setAprendida(ordenUpdated.getAprendida());
            ordenToUpdate.setFecha(ordenUpdated.getFecha());
            ordenToUpdate.setOrden(ordenUpdated.getOrden());

            return "Orden modificada";
        }

        return "¡Error! No se puede modificar la orden";
    }
    
}
