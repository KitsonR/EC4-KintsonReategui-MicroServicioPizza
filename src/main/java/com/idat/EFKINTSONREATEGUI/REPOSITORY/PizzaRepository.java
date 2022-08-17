package com.idat.EFKINTSONREATEGUI.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFKINTSONREATEGUI.MODEL.Pizza;


@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}
