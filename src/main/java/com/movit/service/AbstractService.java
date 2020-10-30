package com.movit.service;

import java.util.ArrayList;

public abstract interface AbstractService<T,I,D> {
	
	public void crearBD(D clase);
	
	public T consultarIdBD(I id);
	
	public void editarBD(T clase);
	
	public ArrayList<T> consultarBDD();
	
	public void eliminarBD(I id);		

}
