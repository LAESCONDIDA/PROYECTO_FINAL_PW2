package modelo;

import java.util.ArrayList;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

public class Pedido_RevervarMesa {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key idPedidoReserva;
	@Persistent
    private int fechaAnio;
	@Persistent
    private int fechaMes;
	@Persistent
    private int fechaDia;
	@Persistent
    private float total;
	@Persistent
	private Usuario user;
	@Persistent
	private Mesa mesa;
	@Persistent
	private ArrayList<PedidoPlato> platos;
	@Persistent
	private ArrayList<PedidoBebida> bebidas;
	@Persistent
	private int hora;
	@Persistent
    private int minutos;

    public Pedido_RevervarMesa() {
    
    }
    public Pedido_RevervarMesa(Usuario user,Mesa mesa,int fechaAnio,int fechaMes,int fechaDia,int entregaHora,int entregaMinutos) {
        super();
    	this.user = user;
    	this.mesa=mesa;
    	this.fechaAnio = fechaAnio;
    	this.fechaMes = fechaMes;
    	this.fechaDia = fechaDia;
    	this.hora = entregaHora;
    	this.minutos = entregaMinutos;
    	
    	platos = new ArrayList<PedidoPlato>();
    	bebidas = new ArrayList<PedidoBebida>();
    	
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

    public float getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Usuario getUsuario() {
        return user;
    }

    public void setUsuario(Usuario usuario) {
        this.user = usuario;
    }
    public Usuario getMesa() {
        return user;
    }

    public void setMesa(Usuario usuario) {
        this.user = usuario;
    }
    public void setHora(int hora){
    	this.hora=hora;
    }
    public int getHora(){
    	return hora;
    }
    public void setMinuto(int min){
    	this.minutos=min;
    }
    public int getMinuto(){
    	return minutos;
    }

}
