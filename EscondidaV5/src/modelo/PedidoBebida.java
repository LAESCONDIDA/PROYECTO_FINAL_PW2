/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class PedidoBebida{
    
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key idPedidoBebida;
	@Persistent
	private Bebida bebida;
	@Persistent
    private int cantidad;
	@Persistent
    private float total;
    
	public PedidoBebida() {
    }

    public PedidoBebida(Bebida ped_bebida, int cantidad) {
        super();
        this.bebida=ped_bebida;
        this.cantidad=cantidad;
        this.total=(float) (ped_bebida.getPrecio()*cantidad);
    }

    public String getIdPedidoBebida() {
        return KeyFactory.keyToString(idPedidoBebida);
    }

    public void setIdPedidoBebida(String idPedidoBebida) {
    	Key keyPedidoBebida = KeyFactory.stringToKey(idPedidoBebida);
		this.idPedidoBebida= KeyFactory.createKey(keyPedidoBebida,PedidoBebida.class.getSimpleName(), java.util.UUID.randomUUID().toString());
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
    
}
