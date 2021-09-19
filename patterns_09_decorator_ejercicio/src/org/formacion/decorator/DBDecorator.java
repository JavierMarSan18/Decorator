package org.formacion.decorator;

public abstract class DBDecorator implements BaseDatos{
	
	protected BaseDatos dbDecorada;
	
	public DBDecorator(BaseDatos dbDecorada) {
		this.dbDecorada = dbDecorada;
	}
	
	
}
