package com.idat.EFKINTSONREATEGUI.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFKINTSONREATEGUI.MODEL.PizzaDetalle;


@Repository
public interface PizzaClienteRepository extends JpaRepository<PizzaDetalle, Integer> {

}
