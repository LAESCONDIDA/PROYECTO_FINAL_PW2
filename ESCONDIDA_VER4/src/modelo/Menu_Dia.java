package modelo;

import java.util.ArrayList;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Menu_Dia {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key idMenu;
	private ArrayList<Plato> platos;
	@Persistent
	private ArrayList<Bebida> bebidas;
	@Persistent
	private int anio;
	@Persistent
	private int mes;
	@Persistent
	private int dia;

	public Menu_Dia(int anio,int mes,int dia){
		super();
		this.anio=anio;
		this.mes=mes;
		this.dia=dia;
		
		platos =new ArrayList<Plato>();
		bebidas =new ArrayList<Bebida>();
		
	}
	public String getIdMenu() {
		return KeyFactory.keyToString(idMenu);
	}
	public void setIdMenu(String idMenu){
		Key keyMenu = KeyFactory.stringToKey(idMenu);
		this.idMenu= KeyFactory.createKey(keyMenu,Menu_Dia.class.getSimpleName(), java.util.UUID.randomUUID().toString());
	}
	public int getAnio(){
		return anio;
	}
	public void setAnio(int anio){
		this.anio=anio;
	}
	public int getMes(){
		return mes;
	}
	public void setMes(int mes){
		this.mes=mes;
	}
	public int getDia(){
		return dia;
	}
	public void setDia(int dia){
		this.dia=dia;
	}
	
}