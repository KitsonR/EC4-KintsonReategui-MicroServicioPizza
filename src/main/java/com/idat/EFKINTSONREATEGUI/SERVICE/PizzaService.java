package com.idat.EFKINTSONREATEGUI.SERVICE;

import java.util.List;

import com.idat.EFKINTSONREATEGUI.MODEL.Pizza;




public interface PizzaService {
	
	List<Pizza> listar();
	Pizza ObtenerId(Integer id);	
	void guardar(Pizza pizza);
	void eliminar(Integer id);
	void actualizar(Pizza pizza);	

	void asignarClienteaPizza();
}
