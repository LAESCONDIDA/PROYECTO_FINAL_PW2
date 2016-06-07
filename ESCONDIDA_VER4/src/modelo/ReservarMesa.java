package modelo;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class ReservarMesa {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key idReservaMesa;
    @Persistent
    private Usuario user;
    @Persistent
    private Mesa mesa;
    @Persistent
    private int fechaAnio;
	@Persistent
    private int fechaMes;
	@Persistent
    private int fechaDia;
	
	@Persistent
	private int hora;
	@Persistent
    private int minutos;
	
	public ReservarMesa(Usuario user,Mesa mesa,int fechaAnio,int fechaMes, int fechaDia,int entregaHora,int entregaMinutos) {
        super();
        this.user = user;
        this.mesa = mesa;
        this.fechaAnio = fechaAnio;
        this.fechaMes = fechaMes;
        this.fechaDia = fechaDia;
        this.hora = entregaHora;
        this.minutos = entregaMinutos;
        
    }

    public String getIdReservaMesa() {
        return KeyFactory.keyToString(idReservaMesa);
    }

    public void setIdReservaMesa(String idReservaMesa) {
    	Key keyReservaMesa = KeyFactory.stringToKey(idReservaMesa);
		this.idReservaMesa= KeyFactory.createKey(keyReservaMesa,ReservarMesa.class.getSimpleName(), java.util.UUID.randomUUID().toString());
    }
    public Usuario getUser(){
    	return user;
    }
    public void setUser(Usuario user){
    	this.user=user;
    }
    public Mesa getMesa(){
    	return mesa;
    }
    public void setMesa(Mesa mesa){
    	this.mesa = mesa;
    }
    public int getFechaAnio() {
        return fechaAnio;
    }

    public void setFechaAnio(int fechaAnio) {
        this.fechaAnio = fechaAnio;
    }

    public int getFechaMes() {
        return fechaMes;
    }

    public void setFechaMes(int fechaMes) {
        this.fechaMes = fechaMes;
    }

    public int getFechaDia() {
        return fechaDia;
    }

    public void setFechaDia(int fechaDia) {
        this.fechaDia = fechaDia;
    }
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
}
