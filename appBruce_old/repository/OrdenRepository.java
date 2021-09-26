package com.appBruce.appBruce.repository;

import java.util.Optional;

import com.appBruce.appBruce.entities.Orden;

import org.springframework.data.jpa.repository.JpaRepository;


public interface OrdenRepository extends JpaRepository<Orden, Long> {
    void save(Optional<Orden> ordenToUpdate);
}
